package com.websocket.config;

import com.websocket.exeception.WebSocketConnectionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    private final WebSocketConnectionHandler socketConnectionHandler;

    public WebSocketConfig(WebSocketConnectionHandler handler) {
        this.socketConnectionHandler = handler;
    }

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(socketConnectionHandler, "/ws/topic").setAllowedOrigins("*");
    }
}
