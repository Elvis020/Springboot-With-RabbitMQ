package com.javarevesion.springbootrabbotmqtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRabbitmqTutorialApplication {
	/*
		Remember that the Rabbit MQ app is hosted at http://localhost:15672/
	 */

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitmqTutorialApplication.class, args);
    }

}
