package com.example.boardserver.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "board")
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="board_idx", nullable = false)
    private Long boardIdx;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy = "board", fetch = FetchType.EAGER)
    @Column(name = "comments")
    private List<Comment> comments = new ArrayList<>();
}