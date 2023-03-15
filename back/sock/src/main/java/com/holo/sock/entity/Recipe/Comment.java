package com.holo.sock.entity.Recipe;

import com.holo.sock.entity.BaseEntity;
import com.holo.sock.entity.Member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Builder
public class Comment extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private long Id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
    private String content;
}
