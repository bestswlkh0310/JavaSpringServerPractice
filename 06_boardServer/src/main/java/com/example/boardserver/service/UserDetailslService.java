package com.example.boardserver.service;

import com.example.boardserver.domain.entity.User;

public interface UserDetailslService {
    public User getUserIdx(Long idx);
    public void signInUser(User user);

    public User getUserByUserId(String userId);
}