package com.example.boardserver.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "board")
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="board_idx", nullable = false)
    private Long boardIdx;

    @Column(nullable = false)
    private String title;

//    @Column(nullable = false)
//    private String content;
//
//    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true/*, fetch = FetchType.EAGER*/)
//    private List<Comment> comments = new ArrayList<>();

//    public void addComment(Comment comment) {
//        this.comments.add(comment);
//
//    }
}