package com.xyz.oot.hookshot.service.impl;

import com.xyz.oot.hookshot.dto.response.HookshotResponse;
import com.xyz.oot.hookshot.http.rest.client.UserServiceClient;
import com.xyz.oot.hookshot.http.rest.dto.response.UserResponse;
import com.xyz.oot.hookshot.service.HookshotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class HookshotServiceImpl implements HookshotService {

    private final UserServiceClient userServiceClient;

    public HookshotServiceImpl(UserServiceClient userServiceClient) {
        this.userServiceClient = userServiceClient;
    }

    @Override
    public Mono<HookshotResponse> initialHookshot(String id) {

        log.info("calling user service downstream, using id={}", id);
        Mono<UserResponse> user = userServiceClient.getUserById(id);

        // client for account

        // client for notif

        return Mono.zip(user,
                        // just a sample for param2
                        user)
                .map(tuple ->
                        new HookshotResponse(tuple.getT1()));
    }
}
