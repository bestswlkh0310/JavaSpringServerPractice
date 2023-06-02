package com.example.boardserver.domain.res;


import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardResponse {
    /**
     * idx
     */
    private Long idx;
    /**
     * title
     */
    private String title;
    /**
     * content
     */
    private String content;

    /**
     *  comments
     */
//    private List<Comment> comments;
    /**
     * board to boardResponse
     * @param board
     */
    public BoardResponse(Board board) {
        System.out.println(board.getTitle());
        idx = board.getBoardIdx();
        title = board.getTitle();
//        content = board.getContent();
//        comments = board.getComments();
    }
}