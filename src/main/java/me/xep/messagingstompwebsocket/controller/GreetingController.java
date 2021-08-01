package me.xep.messagingstompwebsocket.controller;

import me.xep.messagingstompwebsocket.message.Greeting;
import me.xep.messagingstompwebsocket.message.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    //The return value is broadcast to all subscribers of /topic/greetings
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws InterruptedException {
        Thread.sleep(1000L);
        return Greeting.fromHello(helloMessage);
    }

}
