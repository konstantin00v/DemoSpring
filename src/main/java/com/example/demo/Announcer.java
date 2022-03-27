package com.example.demo;
import org.springframework.context.ApplicationListener;

import java.util.Locale;
import java.util.ResourceBundle;

public class Announcer implements ApplicationListener<GuessEvent> {
    public static ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en®"));

    @Override
    public void onApplicationEvent(GuessEvent event) {
        System.out.println(rsrcbndl.getString("entr"));
    }
}
