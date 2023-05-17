package com.example.boardserver.service.impl;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.repository.BoardRepository;
import com.example.boardserver.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public Board getBoard(Long id) {
        return boardRepository.getBoard(id);
    }

    @Override
    public List<Board> getBoards(Long size) {
        return null;
    }
}
