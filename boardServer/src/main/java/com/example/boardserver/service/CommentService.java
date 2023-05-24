package com.example.boardserver.service;

import com.example.boardserver.domain.res.CommentResponse;

public interface CommentService {
    public void deleteComment(Long idx);
    public CommentResponse getComment(Long idx);
}