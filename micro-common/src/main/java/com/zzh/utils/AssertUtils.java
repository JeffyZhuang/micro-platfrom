package com.zzh.utils;

import java.util.Objects;

/**
 * @Author: zzh
 * @Description: 断言工具类
 * @Date: 2019/10/19
 */
public class AssertUtils {

    /**
     * @return
     * @Description 对象为空抛出异常
     * @Date 2019/10/19 14:12
     * @Param
     * @author zzh
     **/
    public static void notNull(Object object, String message) {
        if (Objects.isNull(object)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * @return
     * @Description 字段为空则抛出异常
     * @Date 2019/10/19 14:13
     * @Param
     * @author zzh
     **/
    public static void notNull(CharSequence text, String message) {
        if (CollectionUtils.isEmpty(text)) {
            throw new IllegalArgumentException(message);
        }
    }

    /**
     * @description: 对所有参数做空指针校验
     * @author: zzh
     * @date: 2020/3/19 14:07
     * @return:
     */
    public static void notNull(Object... args) {
        notNull(args, "the params must not be empty!");
        for (int i = 0; i < args.length; i++) {
            notNull(args[i], String.format("the params in index[%d] can not be empty", i));
        }
    }
}
