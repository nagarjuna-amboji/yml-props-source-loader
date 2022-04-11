package io.amigos.initializer;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.util.List;

public class YAMLPropertySourceLoaderInitializer implements
        ApplicationContextInitializer<ConfigurableApplicationContext> {


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        ConfigurableEnvironment environment = null;
        YamlPropertySourceLoader loader = null;
        List<PropertySource<?>> propertySourceList = null;


        environment = applicationContext.getEnvironment();
        try {
            loader = new YamlPropertySourceLoader();
            propertySourceList = loader.load("config", applicationContext.getResource("classpath:app-global.yaml"));
        } catch (IOException e) {
           throw new RuntimeException("Failed to load the app-global.yaml file", e);
        }

        /*for (PropertySource<?> propertySource : propertySourceList) {
            environment.getPropertySources().addLast(propertySource);
        }*/

        ConfigurableEnvironment finalEnvironment = environment;
        propertySourceList.stream().forEach(propertySource -> {
            finalEnvironment.getPropertySources().addLast(propertySource);
        });

    }
}
