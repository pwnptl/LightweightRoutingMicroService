package com.gameverse.routing.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfig {
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/a")
                        .filters(f -> f.addRequestHeader("Game", "Google"))
                        .uri("http://www.google.com"))
                .route(p -> p
                        .path("/b")
                        .filters(f -> f.addRequestHeader("Game", "Outlook"))
                        .uri("http://www.outlook.com"))
                .build();
    }
}
