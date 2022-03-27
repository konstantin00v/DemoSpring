package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		GetRandomInteger randInt = (GetRandomInteger) context.getBean(GetRandomInteger.class);
		int randomizeNumber = randInt.getRandomInt();
		ResourceBundle rsrcbndl = ResourceBundle.getBundle("text", new Locale("en"));

		Scanner sc = new Scanner(System.in);

		System.out.println(rsrcbndl.getString("start") + "\n" + rsrcbndl.getString("starttry"));
		context.publishEvent(new GuessEvent(randInt));
		while (true) {
			int number = sc.nextInt();
			if ( number > randomizeNumber ) {
				context.publishEvent(GuessEvent.less());
			} else if ( number < randomizeNumber) {
				context.publishEvent(GuessEvent.more());
			} else break;
		}
		System.out.println(rsrcbndl.getString("figuredOut") + " " + randomizeNumber);
		sc.close();
	}
}
