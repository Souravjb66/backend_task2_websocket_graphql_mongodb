package com.websocket.project.secondno.controller;

import com.websocket.project.secondno.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ValueController {
    @Autowired
    private ChatService chatService;
    @QueryMapping("getUserChat")
    public List<String>getUserChat(@Argument String user){
        var i=chatService.getUserChat(user);
        List<String>data=new ArrayList<>();
        for(var a:i){
            data.add(a.getUsername()+" "+a.getChat());
        }
        return data;
    }
    @QueryMapping("getAllChat")
    public List<String>getAllChat(){
        var msg=chatService.getAllMsg();
        List<String>data=new ArrayList<>();
        for(var i:msg){
            data.add(i.getUsername()+" "+i.getChat());
        }
        return data;
    }
}
