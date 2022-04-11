package io.amigos;

import io.amigos.beans.Contract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class YAMLPropsSourceLoaderApplicationConfiguration {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(YAMLPropsSourceLoaderApplicationConfiguration.class, args);
        Contract contract = context.getBean(Contract.class);
        System.out.println(contract);

    }
}
