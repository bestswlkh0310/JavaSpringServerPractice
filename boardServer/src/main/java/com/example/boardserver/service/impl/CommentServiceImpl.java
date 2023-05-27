package com.example.boardserver.service.impl;

import com.example.boardserver.domain.entity.Comment;
import com.example.boardserver.domain.res.CommentResponse;
import com.example.boardserver.repository.BoardRepository;
import com.example.boardserver.repository.CommentRepository;
import com.example.boardserver.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    @Override
    @Transactional
    public void postComment(Comment comment) {
//        System.out.println(comment.toString());
//        boardRepository.findById(comment.getBoard().getBoardIdx()).get().addComment(comment);
//        commentRepository.save(comment);
    }

    @Override
    public void deleteComment(Long idx) {
        commentRepository.deleteById(idx);
    }

    @Override
    public CommentResponse getComment(Long idx) {
        return new CommentResponse(commentRepository.findById(idx).orElseThrow());
    }
}
