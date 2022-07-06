package com.hy.springbootdemoquick01.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
//    @Value("${person.name}")
//    @Email
    private String name;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
//    @Value("person.birth:2022/01/01")
    private Date birth;
//    private Map<String,Object> maps;
//    private List<Object> lists;
//    private Dog dog;

}
