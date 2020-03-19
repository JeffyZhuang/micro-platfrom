package com.zzh.utils;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/**
 * @Description 配置文件读取工具类
 * @Author zzh
 * @Date 2020/3/19 14:33
 **/
@Slf4j
public class PropertiesUtils {
    private static String serverAddr;

    private static String namespaceId;

    private static String groupId;

    private static Map<String, Properties> fileProperties = Maps.newHashMap();

    /**
     * @description: 获取配置文件中的值
     * @author: zzh
     * @date: 2020/3/19 14:42
     * @return:
     */
    public static String getPropertiesValue(String fileName, String key) {
        Properties properties = fileProperties.get(key);
        if (Objects.isNull(properties))
            properties = syncGetPropertiesAndPut(fileName);
        return properties.getProperty(key);
    }

    /**
     * @description: 读取配置文件
     * @author: zzh
     * @date: 2020/3/19 14:43
     * @return:
     */
    private static Properties syncGetPropertiesAndPut(String fileName) {
        Properties properties = fileProperties.get(fileName);
        if (Objects.isNull(properties)) {
            properties = loadProperties(fileName);
            fileProperties.put(fileName, properties);
        }
        return properties;
    }

    /**
     * @description: 读取fileName的配置文件
     * @author: zzh
     * @date: 2020/3/19 14:45
     * @return:
     */
    private static Properties loadProperties(String fileName) {
        try {
            Properties properties = new Properties();
            properties.load(
                    new BufferedReader(
                            new InputStreamReader(
                                    new ClassPathResource(fileName).getInputStream(), "UTF-8")));
            return properties;
        } catch (Exception e) {
            log.error("PropertiesUtils load file error, fileName={}", fileName);
        }
        return null;
    }
}
