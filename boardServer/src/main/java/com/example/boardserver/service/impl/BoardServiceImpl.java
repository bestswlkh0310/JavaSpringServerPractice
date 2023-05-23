package com.example.boardserver.service.impl;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.BoardInfo;
import com.example.boardserver.repository.BoardRepository;
import com.example.boardserver.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository;

    @Override
    public Board getBoard(Long idx) {
        return boardRepository.findById(idx).get();
    }

    @Override
    public List<Board> getBoards() {
        return boardRepository.findTop10ByOrderByIdx();
    }

    @Override
    public List<BoardInfo> getBoardInfo() {
        List<Board> boards = boardRepository.findTop10ByOrderByIdx();
        List<BoardInfo> boardInfos = new ArrayList<>();
        for (Board board : boards) {
            boardInfos.add(new BoardInfo(
                    board.getIdx(),
                    board.getTitle()
            ));
        }
        return boardInfos;
    }

    @Override
    public void postBoard(Board board) {
        boardRepository.save(board);
    }

    @Override
    public void deleteBoard(Long idx) {
        boardRepository.deleteById(idx);
    }
}
