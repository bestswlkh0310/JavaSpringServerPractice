package com.example.boardserver.controller;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.res.ResponseDto;
import com.example.boardserver.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class RestBoardController {
    private final BoardService boardService;

    @GetMapping("/get/board/{idx}")
    public ResponseEntity<?> getBoard(@PathVariable("idx") Long idx) {
        Board board = boardService.getBoard(idx);
        System.out.println(board.getTitle() + " " + board.getContent());
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(board)
                        .build()
                ,
                HttpStatus.OK
        );
    }

    @GetMapping("/get/board-info")
    public ResponseEntity<?> getBoardInfo() {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(boardService.getBoardInfo())
                        .build()
                , HttpStatus.OK
        );
    }

    @GetMapping("/get/boards")
    public ResponseEntity<?> getBoards() {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(boardService.getBoards())
                        .build()
                , HttpStatus.OK
        );
    }

    @PostMapping("/post/board")
    public void postBoard(@RequestBody Board board) {
        boardService.postBoard(board);
    }

    @DeleteMapping("/delete/board/{idx}")
    public void deleteBoard(@PathVariable("idx") Long idx) {
        boardService.deleteBoard(idx);
    }
}
