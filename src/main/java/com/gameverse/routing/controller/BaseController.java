package com.gameverse.routing.controller;

import com.gameverse.routing.model.Route;
import com.gameverse.routing.service.RoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    RoutingService routingService;

    @GetMapping("/get")
    public List<Route> getRoutes() {
        return routingService.getAllRoutes("any key");
    }


    @GetMapping("/")
    public String base() {
        return "base page";
    }
}
