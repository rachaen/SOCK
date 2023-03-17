package com.holo.sock.service;

import com.holo.sock.dto.snack.request.RegisterReviewRequestDto;
import com.holo.sock.dto.snack.request.RegisterSnackRequestDto;
import com.holo.sock.dto.snack.response.SnackDetailResponseDto;
import com.holo.sock.entity.member.Member;
import com.holo.sock.entity.snack.*;
import com.holo.sock.exception.member.MemberNotFoundException;
import com.holo.sock.exception.snack.SnackNotFoundException;
import com.holo.sock.exception.type.TypeNotFoundException;
import com.holo.sock.repository.member.MemberRepository;
import com.holo.sock.repository.snack.FlavorRepository;
import com.holo.sock.repository.snack.ReviewRepository;
import com.holo.sock.repository.snack.SnackRepository;
import com.holo.sock.repository.snack.TypeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class SnackService {

    private final SnackRepository snackRepository;
    private final TypeRepository typeRepository;
    private final FlavorRepository flavorRepository;
    private final MemberRepository memberRepository;
    private final ReviewRepository reviewRepository;

    @Transactional
    public void registerSnacks(List<RegisterSnackRequestDto> requestDto){
        HashSet<Long> flavorIdsSet = new HashSet<>();
        for (RegisterSnackRequestDto dto : requestDto) {
            Arrays.stream(dto.getFlavor().split(", ")).map(Long::parseLong).forEach(flavorIdsSet::add);
        }

        List<Flavor> flavorsByIdIn = flavorRepository.findFlavorsByIdIn(new ArrayList<>(flavorIdsSet));
        Map<Long, Flavor> flavorMap = flavorsByIdIn.stream()
                .collect(Collectors.toMap(Flavor::getId, Function.identity()));

        for (RegisterSnackRequestDto dto : requestDto) {
            Type type = typeRepository.findById(dto.getType_id()).orElseThrow(TypeNotFoundException::new);
            List<Long> flavorIds = Arrays.stream(dto.getFlavor().split(", "))
                    .map(Long::parseLong).collect(Collectors.toList());

            Snack snack = dto.toEntity(type);
            for (Long flavorId : flavorIds) {
                snack.getFlavors().add(
                        SnackFlavor.builder()
                                .snack(snack)
                                .flavor(flavorMap.get(flavorId))
                                .build()
                );
            }
            snackRepository.save(snack);
        }
    }

    public SnackDetailResponseDto searchSnackDetail(Long snackId){
        Snack snack = snackRepository.findSnackByIdWithTypeAndFlavor(snackId).orElseThrow(SnackNotFoundException::new);
        return SnackDetailResponseDto.create(snack);
    }

    @Transactional
    public void registerReview(Long snackId, RegisterReviewRequestDto requestDto){
        Long writerId = requestDto.getWriterId();
        Member writer = memberRepository.findById(writerId).orElseThrow(MemberNotFoundException::new);

        Snack snack = snackRepository.findById(snackId).orElseThrow(SnackNotFoundException::new);

        Review review = requestDto.toEntity(writer, snack);
        reviewRepository.save(review);

        snack.registerReview(requestDto.getStar());
    }
}
