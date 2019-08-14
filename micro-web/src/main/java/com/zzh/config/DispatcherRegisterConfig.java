package com.zzh.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;

/**
 * @Description 上下文配置文件
 * @Author zzh
 * @Date 2019/8/11 16:47
 **/
@Configuration
public class DispatcherRegisterConfig {

    @Bean
    public ServletRegistrationBean dispatcherServletRegister(DispatcherServlet dispatcherServlet,
                                                             MultipartConfigElement multipartConfig) {
        ServletRegistrationBean registerBean = new ServletRegistrationBean(dispatcherServlet);
        registerBean.getUrlMappings().clear();
        registerBean.setMultipartConfig(multipartConfig);
        registerBean.addUrlMappings("/zzh/micro/springBoot/*","/*");
        return registerBean;
    }

}
