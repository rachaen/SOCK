package com.holo.sock.entity.snack;

import com.holo.sock.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
public class Snack extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "snack_id")
    private Long id;

    private String image;

    private String name;

    @OneToOne
    @JoinColumn(name = "type_id")
    private Type type;

    private int sumOfStars;

    private int numberOfParticipants;

    private String engName;

    private boolean domestic;
}
