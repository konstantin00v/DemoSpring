package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		GetRandomInteger randInt = (GetRandomInteger) context.getBean(GetRandomInteger.class);
		Announcer anncr = (Announcer) context.getBean(Announcer.class);
		int randomizeNumber = randInt.getRandomInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("Привет, я загадал число, попробуй его отгадать!\nДелай попытку, можно вводить числа от 0 до 1000!");
		while (true) {
			int number = sc.nextInt();
			if ( number > randomizeNumber ) {
				context.publishEvent(GuessEvent.of("Мое число поменьше твоего"));
			} else if ( number < randomizeNumber) {
				context.publishEvent(GuessEvent.of("Мое число побольше твоего"));
			} else break;
		}
		System.out.println("Ты угадал, я загадал число " + randomizeNumber);
		sc.close();
	}

}
