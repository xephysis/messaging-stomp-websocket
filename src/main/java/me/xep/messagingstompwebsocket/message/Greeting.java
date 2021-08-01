package me.xep.messagingstompwebsocket.message;

import org.springframework.web.util.HtmlUtils;

public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public static Greeting fromHello(HelloMessage helloMessage) {
        return new Greeting("Hello, "
                + HtmlUtils.htmlEscape(helloMessage.getName())
                + "!");
    }
}
