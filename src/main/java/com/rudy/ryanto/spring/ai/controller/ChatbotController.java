package com.rudy.ryanto.spring.ai.controller;

import com.rudy.ryanto.spring.ai.model.AskDto;
import com.rudy.ryanto.spring.ai.service.ChatBotServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class ChatbotController {

    @Autowired
    private ChatBotServices chatBotServices;

    @PostMapping(value = "/ask", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String ask(@RequestBody AskDto askDto){
        return chatBotServices.askSomething(askDto);
    }
}