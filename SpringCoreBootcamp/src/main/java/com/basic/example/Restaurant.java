package com.basic.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Restaurant {
    
    private Drink drink;
    private int age;
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public Drink getDrink() {
        return drink;
    }
    
    public void setDrink(Drink drink) {
        this.drink = drink;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Restaurant(Drink drink, String name) {
        this.drink = drink;
        this.name = name;
    }
    
    private String name;
    
    
    @Override
    public String toString() {
        return "Restaurant{" +
                "drink=" + drink +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        
        Drink drink = applicationContext.getBean("tea1",Tea.class);
        drink.getDrink();
        drink = applicationContext.getBean("tea2",Tea.class);
        drink.getDrink();
        
        Restaurant restaurant = (Restaurant) applicationContext.getBean("restaurant");
        System.out.println(restaurant);
    }
}
