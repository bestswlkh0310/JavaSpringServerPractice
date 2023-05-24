package com.example.boardserver.service.impl;

import com.example.boardserver.domain.res.CommentResponse;
import com.example.boardserver.repository.CommentRepository;
import com.example.boardserver.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;

    @Override
    public void deleteComment(Long idx) {
        commentRepository.deleteById(idx);
    }

    @Override
    public CommentResponse getComment(Long idx) {
        return new CommentResponse(commentRepository.findById(idx).orElseThrow());
    }
}
