package com.example.websocket.service;

import org.springframework.stereotype.Service;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@Service
@ServerEndpoint(value = "/chatt")
public class WebSocketChatt {

    @OnMessage
    public void onMessage(String msg, Session session) throws Exception{
        System.out.println("receive Message");
    }

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("open Session");
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("session Close");
    }
}
