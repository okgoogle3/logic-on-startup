package com.example.logic;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.logging.Logger;
@Component
public class InitializingBeanExampleBean implements InitializingBean {

    private static final Logger LOG
            = Logger.getLogger(InitializingBeanExampleBean.class.getName());

    @Autowired
    private Environment environment;

    @Override
    public void afterPropertiesSet() throws Exception {
        LOG.info("InitializingBeanExampleBean " + Arrays.toString(environment.getDefaultProfiles()));
    }
}