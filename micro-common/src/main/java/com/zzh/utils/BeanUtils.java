package com.zzh.utils;

import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.Lists;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @Author: zzh
 * @Description: 拷贝工具类
 * @Date: 2019/10/19
 */
@Slf4j
public class BeanUtils {

    /**
     * @return
     * @Description 判断是否属于基本类型
     * @Date 2019/10/19 14:17
     * @Param
     * @author zzh
     **/
    public static boolean isSimpleProperty(Class clazz) {
        return org.springframework.beans.BeanUtils.isSimpleProperty(clazz);
    }

    /**
     * @return
     * @Description 对象拷贝 返回Optional对象
     * @Date 2019/10/19 14:19
     * @Param
     * @author zzh
     **/
    public static <T> Optional<T> copyWithOpt(Object src, Class<T> targetClazz) {
        return Optional.ofNullable(copy(src, targetClazz));
    }

    /**
     * @return
     * @Description 对象拷贝 返回对象可能为空
     * @Date 2019/10/19 15:08
     * @Param
     * @author zzh
     **/
    public static <T> T copy(Object src, Class<T> targetClazz) {
        if (Objects.isNull(src)) {
            return null;
        }
        return JsonUtils.deserialize(JsonUtils.serialize(src), targetClazz);
    }


    /**
     * @return
     * @Description 拷贝泛型对象
     * @Date 2019/10/19 15:16
     * @Param
     * @author zzh
     **/
    public static <T> T copy(Object source, TypeReference<T> typeReference) {
        if (Objects.isNull(source)) {
            return null;
        }
        return JsonUtils.deserializeAny(JsonUtils.serialize(source), typeReference);
    }


    /**
     * @return
     * @Description Optional 拷贝泛型对象
     * @Date 2019/10/19 15:26
     * @Param
     * @author zzh
     **/
    public static <T> Optional<T> copyWithOpt(Object source, TypeReference<T> targetClazz) {
        return Optional.ofNullable(copy(source, targetClazz));
    }

    /**
     * @return
     * @Description 拷贝对象集合
     * @Date 2019/10/19 15:29
     * @Param
     * @author zzh
     **/
    public static <T> List<T> copyList(List sourceList, Class<T> targetClazz) {
        if (CollectionUtil.isEmpty(sourceList)) {
            return Lists.newArrayList();
        }
        return JsonUtils.deserializeList(JsonUtils.serialize(sourceList), targetClazz);
    }


}
