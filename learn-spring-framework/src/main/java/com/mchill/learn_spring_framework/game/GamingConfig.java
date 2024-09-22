package com.mchill.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public Game game() {
        return new Pacman();
    }

    @Bean
    public GameRunner gameRunner(Game game) {
        return new GameRunner(game);
    }

}
