package com.leisucn.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by sulei on 2017/9/12.
 */

@SpringBootApplication
@EnableAutoConfiguration
public class App {

    public static void main(String[] args){
        SpringApplication app = new SpringApplication(App.class);
        ApplicationContext context = app.run(args);
    }
}
