package com.example.demo;

import org.springframework.context.ApplicationEvent;

public class GuessEvent extends ApplicationEvent {

    public GuessEvent(Object source) {
        super(source);
    }

    public static GuessEventData of(String text) {
        return new GuessEventData(text);
    }

}
