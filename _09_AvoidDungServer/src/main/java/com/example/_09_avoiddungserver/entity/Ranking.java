package com.example._09_avoiddungserver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "ranking")
public class Ranking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "score")
    private int score;
}
