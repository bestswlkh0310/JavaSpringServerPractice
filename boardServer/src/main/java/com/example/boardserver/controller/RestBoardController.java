package com.example.boardserver.controller;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.Comment;
import com.example.boardserver.domain.res.BoardResponse;
import com.example.boardserver.domain.res.ResponseDto;
import com.example.boardserver.service.BoardService;
import com.example.boardserver.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class RestBoardController {
    private final BoardService boardService;
    private final CommentService commentService;

    @GetMapping("/{idx}")
    public ResponseEntity<?> getBoard(@PathVariable("idx") Long idx) {
        BoardResponse boardResponse = boardService.getBoard(idx);
        System.out.println(boardResponse.getTitle());
        System.out.println(boardResponse.getContent());
        System.out.println(boardResponse.getComments());
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(boardResponse)
                        .build()
                ,
                HttpStatus.OK
        );
    }

    @GetMapping("/infos")
    public ResponseEntity<?> getBoardInfo() {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(boardService.getBoardInfo())
                        .build()
                , HttpStatus.OK
        );
    }

    @GetMapping("/boards")
    public ResponseEntity<?> getBoards() {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(boardService.getBoards())
                        .build()
                , HttpStatus.OK
        );
    }

    @PostMapping("/post")
    public void postBoard(@RequestBody Board board) {
        boardService.postBoard(board);
    }

    @DeleteMapping("/delete/{idx}")
    public void deleteBoard(@PathVariable("idx") Long idx) {
        boardService.deleteBoard(idx);
    }

    // new
    @PostMapping("/{idx}/post")
    public void postComment(@PathVariable("idx") Long idx, @RequestBody Comment comment) {
        commentService.postComment(comment);
    }

    @GetMapping("/{idx}/comment")
    public ResponseEntity<?> getComment(@PathVariable("idx") Long idx) {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(commentService.getComment(idx))
                        .build()
                , HttpStatus.OK
        );
    }

    @DeleteMapping("/{idx}/delete")
    public void deleteComment(@PathVariable("idx") Long idx) {
        commentService.deleteComment(idx);
    }
}
