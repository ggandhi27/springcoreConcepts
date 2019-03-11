package com.basic.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurant {
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Drink drink = applicationContext.getBean("tea1",Tea.class);
        drink.getDrink();
        drink = applicationContext.getBean("tea2",Tea.class);
        drink.getDrink();
    }
}
