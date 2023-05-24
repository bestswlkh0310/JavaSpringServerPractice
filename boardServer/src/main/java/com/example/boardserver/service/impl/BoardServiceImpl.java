package com.example.boardserver.service.impl;

import com.example.boardserver.domain.entity.Board;
import com.example.boardserver.domain.entity.BoardInfo;
import com.example.boardserver.domain.res.BoardResponse;
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
    public BoardResponse getBoard(Long idx) {
        Board board = boardRepository.findById(idx).orElseThrow();
        return new BoardResponse(board);
    }

    @Override
    public List<BoardResponse> getBoards() {
        List<BoardResponse> boardResponseList = new ArrayList<>();
        List<Board> boardList = boardRepository.findTop10ByOrderByBoardIdx();
        for (Board board: boardList) {
            boardResponseList.add(new BoardResponse(board));
        }
        for (BoardResponse boardResponse: boardResponseList) {
            System.out.println(boardResponse.toString());
        }
        return boardResponseList;
    }

    @Override
    public List<BoardInfo> getBoardInfo() {
        List<Board> boards = boardRepository.findTop10ByOrderByBoardIdx();
        List<BoardInfo> boardInfos = new ArrayList<>();
        for (Board board : boards) {
            boardInfos.add(new BoardInfo(
                    board.getBoardIdx(),
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
