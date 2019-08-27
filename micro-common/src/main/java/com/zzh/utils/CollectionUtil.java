package com.zzh.utils;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * @Description 集合工具类
 * @Author zzh
 * @Date 2019/8/3 13:10
 **/
public class CollectionUtil {
    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    public static boolean isEmpty(CharSequence str) {
        return Objects.isNull(str) || Objects.equals("", str.toString().trim());
    }

    public static boolean isNotEmpty(CharSequence str) {
        return !isEmpty(str);
    }

}
