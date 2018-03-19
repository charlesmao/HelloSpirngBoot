package com.maozy.study.springBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by maozy on 2018/3/17.
 */
@SpringBootApplication
public class MyConfigApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MyConfigApp.class).properties("spring.config.location=classpath:/abc.properties").run(args);
    }

}
