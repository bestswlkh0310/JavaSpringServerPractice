package com.example.boardserver.service;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.BoardInfo;

import java.util.List;

public interface BoardService {
    public Board getBoard(Long idx);
    public List<Board> getBoards();
    public List<BoardInfo> getBoardInfo();
    public void postBoard(Board board);
    public void deleteBoard(Long idx);
}
