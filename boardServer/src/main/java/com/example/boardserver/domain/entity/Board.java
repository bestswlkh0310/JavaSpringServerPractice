package com.example.boardserver.domain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long idx;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String content;
}