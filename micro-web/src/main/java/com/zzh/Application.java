package com.zzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: zzh
 * @Description: 启动类
 * @Date: 2019/8/1
 */
@EnableSwagger2
@SpringBootApplication
@MapperScan(basePackages = "com.zzh.repository.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
