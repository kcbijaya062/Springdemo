package com.bijayakc.demo;

public class HelloController {

    public String home() {

        String[] cars = {"volvo", "BMW", "ford"};

        System.out.println(cars[2]);
        System.out.println(cars.length);

        return "lets make a controller";
    }
}