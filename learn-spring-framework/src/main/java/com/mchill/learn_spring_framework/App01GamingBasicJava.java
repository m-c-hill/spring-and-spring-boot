package com.mchill.learn_spring_framework;

import com.mchill.learn_spring_framework.game.GameRunner;
import com.mchill.learn_spring_framework.game.MarioGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
            var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
