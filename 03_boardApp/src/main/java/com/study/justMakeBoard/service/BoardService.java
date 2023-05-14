package com.study.justMakeBoard.service;

import com.study.justMakeBoard.entity.Board;
import com.study.justMakeBoard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    /**
     * write board
     * @param board
     */
    public void write(Board board) {
        boardRepository.save(board);
    }

    /**
     * @return boardList
     */
    public List<Board> boardList() {
        return boardRepository.findAll();
    }

    /**
     * @param id
     * @return board
     */
    public Board boardView(Integer id) {
        return boardRepository.findById(id).get();
    }

    public void boardDelete(Integer id) {
        boardRepository.deleteById(id);
    }
}
