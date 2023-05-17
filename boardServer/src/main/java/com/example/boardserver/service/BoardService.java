package com.example.boardserver.service;

import com.example.boardserver.domain.entity.Board;

import java.util.List;

public interface BoardService {
    public Board getBoard(Long idx);
    public List<Board> getBoards(Long size);
}
