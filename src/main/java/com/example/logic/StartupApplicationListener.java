package com.example.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private Environment environment;
    private static final Logger LOG
            = Logger.getLogger(ApplicationListener.class.getName());

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOG.info("StartupApplicationListener " + Arrays.toString(environment.getDefaultProfiles()));
    }
}
