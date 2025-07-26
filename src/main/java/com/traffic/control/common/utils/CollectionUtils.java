package com.traffic.control.common.utils;

/**
 * 集合工具类
 */
public class CollectionUtils {

    /**
     * 判断集合是否为空
     */
    public static boolean isEmpty(java.util.Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    /**
     * 判断集合是否不为空
     */
    public static boolean isNotEmpty(java.util.Collection<?> collection) {
        return !isEmpty(collection);
    }

    /**
     * 获取集合大小
     */
    public static int size(java.util.Collection<?> collection) {
        return collection != null ? collection.size() : 0;
    }

    /**
     * 安全获取第一个元素
     */
    public static <T> T getFirst(java.util.List<T> list) {
        return isNotEmpty(list) ? list.get(0) : null;
    }

    /**
     * 安全获取最后一个元素
     */
    public static <T> T getLast(java.util.List<T> list) {
        return isNotEmpty(list) ? list.get(list.size() - 1) : null;
    }
}
