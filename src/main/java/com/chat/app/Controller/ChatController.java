package com.chat.app.Controller;

import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    public ChatMessage sendMessage(ChatMessage message){
        return message;
    }
}
