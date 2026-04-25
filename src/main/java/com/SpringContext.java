package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.Config;
import com.module.User;

public class SpringContext {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		User user1 = container.getBean("user", User.class);
		System.out.println(user1);

		((AbstractApplicationContext) container).close();
	}

}
