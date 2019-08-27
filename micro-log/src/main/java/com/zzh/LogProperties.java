package com.zzh;

import com.google.common.collect.Lists;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Author: zzh
 * @Description: Log配置文件
 * @Date: 2019/8/27
 */
@Data
@ConfigurationProperties("web.log")
public class LogProperties {

    /**
     * 入参打印最大长度1000
     */
    private Integer requestMaxLength = 1000;

    /**
     * 出参打印最大长度1000
     */
    private Integer responseMaxLength = 1000;

    /**
     * 忽略的打印uri
     */
    private List<String> ignoreUris;

    /**
     * 网关传的traceId，没有默认随机生成
     */
    private String headerTraceIdKey = "admp_trace_id";

    /**
     * 默认忽略打印的uri
     */
    private List<String> defaultIgnoreUris = Lists.newArrayList("swagger");
}
