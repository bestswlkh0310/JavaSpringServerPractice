package com.example.boardserver.controller;

import com.example.boardserver.domain.req.SignInRequest;
import com.example.boardserver.domain.req.SignUpRequest;
import com.example.boardserver.domain.res.ResponseDto;
import com.example.boardserver.service.UserDetailslService;
import com.example.boardserver.domain.entity.User;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/sign")
public class RestSignController {
    private final UserDetailslService userDetailslService;

    @PostMapping("/up")
    public ResponseEntity<?> signUp(@RequestBody SignInRequest signInRequest) {
        userDetailslService.signInUser(new User(signInRequest));
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data("successfully completed")
                        .build()
                , HttpStatus.OK
        );
    }

    @PostMapping("/in")
    public ResponseEntity<?> signIn(@RequestBody SignUpRequest signUpRequest) throws IllegalAccessError {
        User user = userDetailslService.getUserByUserId(signUpRequest.getUserId());
        return new ResponseEntity<>(
                ResponseDto.builder()
                        .status(200)
                        .data(user)
                        .build()
                , HttpStatus.OK
        );
    }
}
