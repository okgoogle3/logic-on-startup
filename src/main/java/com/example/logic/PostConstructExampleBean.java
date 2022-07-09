package com.example.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.logging.Logger;

@Component
public class PostConstructExampleBean {

    private static final Logger LOG
            = Logger.getLogger(PostConstructExampleBean.class.getName());

    @Autowired
    private Environment environment;

    @PostConstruct
    public void init() {
        LOG.info("PostConstructExampleBean " + Arrays.toString(environment.getDefaultProfiles()));
    }
}
