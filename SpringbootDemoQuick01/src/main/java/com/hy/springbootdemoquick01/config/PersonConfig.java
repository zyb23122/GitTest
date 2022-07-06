package com.hy.springbootdemoquick01.config;

import com.hy.springbootdemoquick01.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
    //将方法的返回值添加到容器中：容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloSerivce(){
        return new HelloService();
    }
}
