package com.example.boardserver.service;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.BoardInfo;
import com.example.boardserver.domain.res.BoardResponse;

import java.util.List;

public interface BoardService {
    public BoardResponse getBoard(Long idx);
    public List<BoardResponse> getBoards();
    public List<BoardInfo> getBoardInfo();
    public void postBoard(Board board);
    public void deleteBoard(Long idx);
}
