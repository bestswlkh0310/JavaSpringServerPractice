package com.example._09_avoiddungserver.entity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {
    private int status;
    private Object data;
}
