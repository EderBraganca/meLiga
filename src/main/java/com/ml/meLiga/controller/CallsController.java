package com.ml.meLiga.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallsController {

    @MessageMapping("/call")
    @SendTo("/topic/awsners")
    public String handleChamada(String mensagem){
        return "Received: " + mensagem;
    }

    @GetMapping("/status")
    public String status(){
        return "OK";
    }
}
