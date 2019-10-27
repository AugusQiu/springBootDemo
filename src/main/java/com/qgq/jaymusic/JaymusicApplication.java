package com.qgq.jaymusic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.qgq.jaymusic.mapper") //扫描的mapper
@SpringBootApplication
public class JaymusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(JaymusicApplication.class, args);
    }

}
