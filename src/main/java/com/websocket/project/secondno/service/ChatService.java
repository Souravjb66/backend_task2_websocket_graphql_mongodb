package com.websocket.project.secondno.service;

import com.websocket.project.secondno.model.Message;
import com.websocket.project.secondno.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepository repository;
    public void SaveMsg(Message msg){
        repository.insert(msg);
        System.out.println("store");
    }
    public List<Message>getUserChat(String user){
        return repository.findByUsername(user);
    }
    public List<Message>getAllMsg(){
        return repository.findAll();
    }
}
