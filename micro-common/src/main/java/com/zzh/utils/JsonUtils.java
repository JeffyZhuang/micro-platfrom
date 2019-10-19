package com.zzh.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.List;

/**
 * @Author: zzh
 * @Description: json 工具类
 * @Date: 2019/10/19
 */
public class JsonUtils {
    /**
     * @return
     * @Description 将Java对象转换为json字符串
     * @Date 2019/10/19 14:24
     * @Param
     * @author zzh
     **/
    public static <T> String serialize(T object) {
        return JSON.toJSONString(object);
    }

    /**
     * @return
     * @Description 将JAVA对象转换为JSON格式的字符串，可定制输出对象
     * @Date 2019/10/19 14:28
     * @Param
     * @author zzh
     **/
    public static <T> String serialize(T object, SerializerFeature serializerFeature) {
        return JSON.toJSONString(object, serializerFeature);
    }

    /**
     * @return
     * @Description 将JSON格式的字符串转换为Java类型的对象
     * @Date 2019/10/19 14:30
     * @Param
     * @author zzh
     **/
    public static <T> T deserialize(String json, Class<T> clazz) {
        return JSON.parseObject(json, clazz);
    }

    /**
     * @return
     * @Description 将JSON字符串转换为Java对象列表
     * @Date 2019/10/19 14:32
     * @Param
     * @author zzh
     **/
    public static <T> List<T> deserializeList(String json, Class<T> clazz) {
        return JSON.parseArray(json, clazz);
    }

    /**
     * @return
     * @Description json转换为任意类型的对象
     * @Date 2019/10/19 15:20
     * @Param
     * @author zzh
     **/
    public static <T> T deserializeAny(String json, TypeReference<T> type) {
        return JSON.parseObject(json, type);
    }
}
