package com.example.demo;
import org.springframework.context.ApplicationListener;

public class Announcer implements ApplicationListener<GuessEvent> {
    @Override
    public void onApplicationEvent(GuessEvent event) {
        System.out.println("KKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
    }
}
