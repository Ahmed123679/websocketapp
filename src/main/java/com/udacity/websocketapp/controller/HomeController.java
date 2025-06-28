package com.udacity.websocketapp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.udacity.websocketapp.model.ChatMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
class HomeController {

@RequestMapping(path="/", method=RequestMethod.GET)
public String index() {
    return "index";
}




@MessageMapping("/send")
@SendTo("/topic/messages")
public String chat(ChatMessage message)
{

        return message.toString();
}

}


