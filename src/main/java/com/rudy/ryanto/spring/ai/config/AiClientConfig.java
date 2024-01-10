package com.rudy.ryanto.spring.ai.config;

import com.theokanning.openai.service.OpenAiService;
import org.springframework.ai.client.AiClient;
import org.springframework.ai.openai.client.OpenAiClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiClientConfig {

    @Value("${openai.key}")
    private String apiKey;

    @Bean
    public AiClient aiClient(){
        return new OpenAiClient(new OpenAiService(apiKey));
    }

}
