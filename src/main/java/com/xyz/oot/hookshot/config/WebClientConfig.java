package com.xyz.oot.hookshot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient userServiceWebClient(
            WebClient.Builder builder, @Value("${services.user.base-url}") String url) {

        return builder.baseUrl(url).build();
    }
}
