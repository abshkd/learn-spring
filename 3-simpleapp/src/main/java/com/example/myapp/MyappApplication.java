package com.example.myapp;

import com.example.myapp.dao.BotDAO;
import com.example.myapp.entity.Bot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class MyappApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyappApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(BotDAO botDAO) {
        return runner -> {
            System.out.println("Sarting Matrix");
            createBot(botDAO);
            createBotArmy(botDAO);
        };
    }

    private void createBotArmy(BotDAO botDAO) {
        List<Bot> bots = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new Bot("automated_sentry" + i, "seek and destroy" +
                        " enemy agents not part of the matrix"))
                .peek(bot -> { //make lambda instead of method reference
                    botDAO.save(bot);
                    System.out.println("Saved bot with ID: " + bot.getId());
                }).toList(); //could have used foreach but peek is fun
    }
 
    private void createBot(BotDAO botDAO) {
        System.out.println("creating a new agent....");
        Bot theBot = new Bot("automated_sentry1", "seek and destroy enemy " +
                "agents not part of the matrix");

        System.out.println("Saving the bots");
        botDAO.save(theBot);

        System.out.println("Created a bot. Id: " + theBot.getId());
    }
}
