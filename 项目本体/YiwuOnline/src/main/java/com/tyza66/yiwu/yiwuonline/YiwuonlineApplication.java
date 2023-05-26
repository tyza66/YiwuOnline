package com.tyza66.yiwu.yiwuonline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tyza66.yiwu.yiwuonline.mapper")
public class YiwuonlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiwuonlineApplication.class, args);
    }

}
