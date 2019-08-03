package com.zzh.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @Description 集合工具类
 * @Author zzh
 * @Date 2019/8/3 13:10
 **/
public class CollectionUtil {
    //判断集合为空
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    //判断集合不为空
    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    //判断Map为空
    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    //判断Map不为空
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

}
