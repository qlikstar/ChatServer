package com.festeroo.chatapp.controller;

import com.festeroo.chatapp.model.Message;
import com.festeroo.chatapp.model.OutputMessage;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/chat/{topic}")
    @SendTo("/topic/messages")
    public OutputMessage send( @DestinationVariable("topic") String topic, Message message) throws Exception {
        System.out.println("Text printed -> " +message.getText() + " --- "+ message.getFrom());
        return new OutputMessage(message.getFrom(), message.getText(), topic);
    }
}
