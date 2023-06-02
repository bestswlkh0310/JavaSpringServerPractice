package com.example.boardserver.domain.req;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignInRequest {
    /**
     * userId
     */
    private String userId;

    /**
     * userPw
     */
    private String userPw;


}
