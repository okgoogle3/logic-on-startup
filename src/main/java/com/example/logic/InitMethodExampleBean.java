package com.example.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.logging.Logger;

public class InitMethodExampleBean {

    private static final Logger LOG = Logger.getLogger(InitMethodExampleBean.class.getName());

    @Autowired
    private Environment environment;

    public void init() {
        LOG.info("InitMethodExampleBean" + Arrays.toString(environment.getDefaultProfiles()));
    }
}