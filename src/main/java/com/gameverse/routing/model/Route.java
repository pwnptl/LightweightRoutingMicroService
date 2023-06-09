package com.gameverse.routing.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class Route {
    private String path;
    private HashMap<String, String> headerVars;
    private String forwardingUri;
}
