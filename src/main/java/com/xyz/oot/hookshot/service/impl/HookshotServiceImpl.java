package com.xyz.oot.hookshot.service.impl;

import com.xyz.oot.hookshot.http.rest.client.UserRestClient;
import com.xyz.oot.hookshot.service.HookshotService;

public class HookshotServiceImpl implements HookshotService {

    private final UserRestClient userRestClient;

    public HookshotServiceImpl(UserRestClient userRestClient) {
        this.userRestClient = userRestClient;
    }

    @Override
    public void initialHookshot(String id) {

        userRestClient.getUserById(id);

        // TODO: continue initial hookshot

    }
}
