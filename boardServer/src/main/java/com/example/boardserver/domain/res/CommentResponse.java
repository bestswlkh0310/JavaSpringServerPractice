package com.example.boardserver.domain.res;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommentResponse {
    /**
     * idx
     */
    private Long idx;
    /**
     * content
     */
    private String content;
    /**
     * parent board
     */
    private Board board;

    public CommentResponse(Comment comment) {
        idx = comment.getCommentIdx();
        content = comment.getContent();
        board = comment.getBoard();
    }
}
