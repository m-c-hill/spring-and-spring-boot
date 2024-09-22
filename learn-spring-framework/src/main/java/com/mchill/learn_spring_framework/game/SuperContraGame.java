package com.mchill.learn_spring_framework.game;

public class SuperContraGame implements Game {
    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Go Down");
    }

    @Override
    public void left() {
        System.out.println("Go Left");
    }

    @Override
    public void right() {
        System.out.println("Go Right");
    }
}
