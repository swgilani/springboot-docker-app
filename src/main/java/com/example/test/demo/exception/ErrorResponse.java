package com.example.test.demo.exception;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@Builder
public class ErrorResponse {

    private HttpStatus errorCode;
    private String message;
}
