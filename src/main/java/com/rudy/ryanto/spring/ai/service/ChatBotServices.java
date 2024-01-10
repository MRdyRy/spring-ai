package com.rudy.ryanto.spring.ai.service;

import com.rudy.ryanto.spring.ai.model.AskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.client.AiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ChatBotServices {

    @Autowired
    private AiClient aiClient;

    public String askSomething(AskDto dto) {
        var answer = "";
        try{
            answer = aiClient.generate(dto.getQuestion());
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return answer;
    }

}