package com.zzh;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import javax.servlet.DispatcherType;

/**
 * @Author: zzh
 * @Description: Log自动装载配置类
 * @Date: 2019/8/27
 */
@Configuration
@EnableConfigurationProperties(value = LogProperties.class)
@ConditionalOnProperty(prefix = "web.log", value = "enable", matchIfMissing = true)
@Slf4j
public class LogAutoConfiguration {

    @Autowired
    private LogProperties logProperties;

    @Bean(name = "loggerFilter")
    public FilterRegistrationBean loggerFilter() {
        log.info("loggerFilter init...");
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LoggerFilter(logProperties));
        filterRegistrationBean.setName("loggerFilter");
        filterRegistrationBean.setOrder(Ordered.LOWEST_PRECEDENCE);
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST,DispatcherType.FORWARD);
        log.info("loggerFilter success init...");
        return filterRegistrationBean;
    }

}
