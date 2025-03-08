package com.websocket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ws")
public class WebSocketController {

    @GetMapping("/connection")
    public String testEndpoint() {
        return "WebSocket is up and running....";
    }
}
