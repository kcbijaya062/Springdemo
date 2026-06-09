package com.bijayakc.demo;


public class HelloController {

    public String home() {

        String[] cars = new String[3];
        cars[0] = "volvo";
        cars[1] = "BMW";
        cars[2] = "ford";
        System.out.println(cars[2]);
        System.out.println(cars.length);
        return " lets make a controller";
    }
}
