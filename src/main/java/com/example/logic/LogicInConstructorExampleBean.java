package com.example.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Component
public class LogicInConstructorExampleBean {

    private static final Logger LOG
            = Logger.getLogger(LogicInConstructorExampleBean.class.getName());

    private final Environment environment;

    @Autowired
    public LogicInConstructorExampleBean(Environment environment) {
        this.environment = environment;
        LOG.info("LogicInConstructorExampleBean" + Arrays.toString(environment.getDefaultProfiles()));
    }
}