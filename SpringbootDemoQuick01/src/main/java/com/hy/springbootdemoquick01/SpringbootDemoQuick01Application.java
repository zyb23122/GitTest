package com.hy.springbootdemoquick01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringbootDemoQuick01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoQuick01Application.class, args);
    }

}
