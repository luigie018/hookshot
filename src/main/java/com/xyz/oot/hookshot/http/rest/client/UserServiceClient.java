package com.xyz.oot.hookshot.http.rest.client;
import com.xyz.oot.hookshot.http.rest.dto.response.UserResponse;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import static com.xyz.oot.hookshot.constants.User.GET_USER_URI;

@Component
public class UserServiceClient {

    private final WebClient webClient;

    public UserServiceClient(
            @Qualifier("userServiceWebClient") WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<UserResponse> getUserById(String id) {
        return webClient.get()
                .uri(GET_USER_URI, id)
                .retrieve()
                .bodyToMono(UserResponse.class);
    }
}
