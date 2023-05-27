package com.example.boardserver.service.impl;

import com.example.boardserver.domain.entity.User;
import com.example.boardserver.repository.UserRepository;
import com.example.boardserver.service.UserDetailslService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailslService {

    private final UserRepository userRepository;

    @Override
    public User getUserIdx(Long idx) {
        return userRepository.findById(idx).get();
    }

    @Override
    public User getUserByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }

    @Override
    public void signInUser(User user) {
        userRepository.save(user);
    }


}
