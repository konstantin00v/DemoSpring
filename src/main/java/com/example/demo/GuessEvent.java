package com.example.demo;

import org.springframework.context.ApplicationEvent;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.ResourceBundle;


public class GuessEvent extends ApplicationEvent {

    public GuessEvent(Object source) {
        super(source);
    }
     public static ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));

    public static GuessEvent less()  {
//          String s = new String (rsrcbndl.getString("lessPhrase").getBytes("ISO-8859-1"),"UTF-8";
        return new GuessEvent(new GuessEventData(rsrcbndl.getString("lessPhrase")));
    }

    public static GuessEvent more() {
        String s = rsrcbndl.getString("morePhrase");
//        String text = "Мое число побольше твоего";
        return new GuessEvent(new GuessEventData(s)) ;
    }

}
