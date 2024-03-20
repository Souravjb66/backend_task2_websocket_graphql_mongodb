package com.websocket.project.secondno.controller;

import com.websocket.project.secondno.model.Message;
import com.websocket.project.secondno.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MessageController {
    @Autowired
    private ChatService chatService;
    @MessageMapping("/message")
    @SendTo("/topic/get")
    public Message getContent(@RequestBody Message msg){

        chatService.SaveMsg(msg);
        return msg;                                                      //user1 and user2
    }

    @GetMapping("/chat")
    public String getMessage(){
        return "index.html";
    }
}
