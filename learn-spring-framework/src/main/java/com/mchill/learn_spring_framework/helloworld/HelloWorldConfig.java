package com.mchill.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}
record Address(String street, String city, String state, int zip) {}

@Configuration
public class HelloWorldConfig {

    @Bean
    public String name() {
        return "Matt";
    }

    @Bean
    public int age() {
        return 100;
    }

    public Address address() {
        return new Address("1234 Fake St", "Springfield", "IL", 62701);
    }

    @Bean
    public Person person() {
        return new Person("Matt", 28, new Address("4321 Fake St", "Springfield", "IL", 62701));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age, address are all beans
    }

    @Bean
    public Person person3Parameters(String name , int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean(name= "customAddress")
    public Address address2() {
        return new Address("4321 Fake St", "Springfield", "Oh", 123456);
    }

}
