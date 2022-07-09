package com.example.logic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    private static final Logger LOG
            = Logger.getLogger(ApplicationListener.class.getName());

    public static int counter;

    @Override
    public void run(String...args) throws Exception {
        LOG.info("Increment counter");
        counter++;
    }
}