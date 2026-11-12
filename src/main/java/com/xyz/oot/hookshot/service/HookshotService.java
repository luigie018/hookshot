package com.xyz.oot.hookshot.service;

import com.xyz.oot.hookshot.dto.response.HookshotResponse;
import reactor.core.publisher.Mono;

public interface HookshotService {

    Mono<HookshotResponse> initialHookshot(String id);
}
