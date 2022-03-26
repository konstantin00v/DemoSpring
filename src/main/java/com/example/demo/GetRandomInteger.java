package com.example.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;

import java.util.concurrent.ThreadLocalRandom;

public class GetRandomInteger {

    private final int randomInt;

    public int getRandomInt() {
        return randomInt;
    }

    public GetRandomInteger() {
        randomInt = ThreadLocalRandom.current().nextInt(
                0, 1001);;
        System.out.println(randomInt);
    }

}
