package com.xyz.oot.hookshot.http.rest.client;

import com.xyz.oot.hookshot.http.rest.dto.response.UserResponse;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UserRestClient {

    private final RestClient restClient;

    public UserRestClient(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("http://localhost:8081/v1/user")
                .defaultHeader("Accept", MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public UserResponse getUserById(String id) {
        return restClient.get()
                         .uri("/{id}", id)
                         .retrieve()
                         .body(UserResponse.class);
    }


}
