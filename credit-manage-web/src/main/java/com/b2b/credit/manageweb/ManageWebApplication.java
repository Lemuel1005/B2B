package com.b2b.credit.manageweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.b2b.credit.manageweb.mapper")
@ComponentScan(basePackages = "com.b2b.credit")
public class ManageWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageWebApplication.class, args);
    }
}
