package com.websocket.project.secondno.model;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "open_chat")
public class Message {
    private String Username;
    private String Chat;
    public Message(){}
    public Message(String chat){
        this.Chat=chat;
    }
    public String getChat(){
        return Chat;
    }
    public void setChat(String chat){
        this.Chat=chat;
    }
    public String getUsername(){return Username;}
    public void setUsername(String username){
        this.Username=username;
    }
}
