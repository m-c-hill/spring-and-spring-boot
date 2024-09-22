package com.mchill.learn_spring_framework;

import com.mchill.learn_spring_framework.game.Game;
import com.mchill.learn_spring_framework.game.GameRunner;
import com.mchill.learn_spring_framework.game.GamingConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(GamingConfig.class);

        context.getBean(GameRunner.class).run();
    }
}
