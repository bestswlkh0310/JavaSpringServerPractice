package com.example.boardserver.controller;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.res.ResponseDto;
import com.example.boardserver.service.BoardService;
import com.example.boardserver.service.impl.BoardServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/board")
public class RestBoardController {
    private final BoardService boardService;

    @GetMapping("/board")
    public ResponseEntity<?> getBoard(@RequestParam(name = "id") Long id) {
        Board board = boardService.getBoard(id);
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

    @GetMapping("/boards")
    public ResponseEntity<?> getBoards(@RequestParam(name = "size") Long id) {
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(boardService.getBoards(id))
                        .build()
                ,HttpStatus.OK
        );
    }
}
