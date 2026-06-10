package com.bijayakc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("Hello this is my first class and I am learning java spring");
          int s =  Naming.maximum(7,12);
          //System.out.println(controller);
          System.out.println("The maximum number is "+s);
          HelloController controller = new HelloController();
         String outcome = controller.home();
         System.out.println("here we get the message in the variable outcome which is "+ outcome);
    }
}