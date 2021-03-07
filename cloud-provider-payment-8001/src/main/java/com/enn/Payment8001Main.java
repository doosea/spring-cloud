package com.enn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.enn.dao")
public class Payment8001Main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001Main.class, args);
    }
}
