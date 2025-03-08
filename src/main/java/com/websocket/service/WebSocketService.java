package com.websocket.service;

import org.springframework.stereotype.Service;

@Service
public class WebSocketService {

    public  String proccessMessage(String msg){
        //any logic implement here
        return "Processed: " + msg;

    }


}