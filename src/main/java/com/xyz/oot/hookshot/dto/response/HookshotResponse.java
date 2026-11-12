package com.xyz.oot.hookshot.dto.response;

import com.xyz.oot.hookshot.http.rest.dto.response.UserResponse;
import lombok.*;

@Data
@Builder
public class HookshotResponse {

    private UserResponse userResponse;

    public HookshotResponse(UserResponse userResponse) {
        this.userResponse = userResponse;
    }

}
