package com.mchill.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldJava {
    public static void main(String[] args) {
        //1: Launch a Spring context

        try(var context = new AnnotationConfigApplicationContext(HelloWorldConfig.class)) {
            //2: Configure the things we want the Spring framework to manage
            // name method created within HelloWorldConfig.java with the @Bean annotation

            //3: Get the bean(s) from the Spring context
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("customAddress"));
        };
    }
}
