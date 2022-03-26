package com.example.demo;

import java.time.LocalDateTime;

public class GuessEventData {
    private final LocalDateTime createdAt;
    private String text;

    public GuessEventData(String text) {
        createdAt = LocalDateTime.now();
        this.text = text;
        System.out.println(text);
    }
}
