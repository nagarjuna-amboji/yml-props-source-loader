package io.amigos;

import io.amigos.beans.Contract;
import io.amigos.initializer.YAMLPropertySourceLoaderInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:app-global.properties")
public class YAMLPropsSourceLoaderApplicationConfiguration {

    public static void main(String[] args) {

//        ApplicationContext context = SpringApplication.run(YAMLPropsSourceLoaderApplicationConfiguration.class, args);

        SpringApplication application = new SpringApplicationBuilder(YAMLPropsSourceLoaderApplicationConfiguration.class)
                .initializers(new YAMLPropertySourceLoaderInitializer()).build();
        ApplicationContext context = application.run(args);
        Contract contract = context.getBean(Contract.class);
        System.out.println(contract);

    }
}
