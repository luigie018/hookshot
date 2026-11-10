package com.xyz.oot.hookshot.http.rest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {

    private String name;
    private int age;
    private String nationality;
    private String address;
    private String sex;
    private String occupation;

}