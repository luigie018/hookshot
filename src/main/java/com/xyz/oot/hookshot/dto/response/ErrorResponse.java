package com.xyz.oot.hookshot.dto.response;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

    private int code;
    private String error;
    private String message;
}
