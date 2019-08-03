package com.zzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: zzh
 * @Description:
 * @Date: 2019/8/1
 */
@SpringBootApplication
@MapperScan(basePackages = "com.zzh.repository.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
