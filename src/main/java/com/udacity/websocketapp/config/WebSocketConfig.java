package com.udacity.websocketapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurationSupport;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

import com.udacity.websocketapp.model.TutorialHandler;


@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer
 {
    @Autowired
    TutorialHandler tutorialHandler;


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) 
    {
       registry.addHandler(tutorialHandler,"/chat");
      
    
    }

}