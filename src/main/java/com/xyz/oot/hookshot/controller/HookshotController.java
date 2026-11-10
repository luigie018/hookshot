package com.xyz.oot.hookshot.controller;

import com.xyz.oot.hookshot.service.HookshotService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/hookshot")
public class HookshotController {

    private final HookshotService hookshotService;

    public HookshotController(HookshotService hookshotService) {
        this.hookshotService = hookshotService;
    }

    @GetMapping
    public ResponseEntity<?> initialHookshot() {

        String id = "123";

        hookshotService.initialHookshot(id);

        return ResponseEntity.ok().build();
    }

}
