package com.example.boardserver.domain.res;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {
    private int status;
    private Object data;
}