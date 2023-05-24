package com.example.boardserver.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "comment")
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentIdx;

    @Column(nullable = false)
    private String content;

    @ManyToOne(targetEntity = Board.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "board_idx")
    private Board board;
}