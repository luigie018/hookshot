package com.xyz.oot.hookshot.exception.handler;

import com.xyz.oot.hookshot.dto.response.ErrorResponse;
import com.xyz.oot.hookshot.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleUserNotFound(Exception e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(ErrorResponse.builder()
                                   .error("USER_NOT_FOUND")
                                   .message(e.getLocalizedMessage())
                .build());
    }
}
