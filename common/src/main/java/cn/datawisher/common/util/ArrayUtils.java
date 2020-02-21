package cn.datawisher.common.util;

/**
 * @ClassName ArrayUtils
 * @Description 数组工具类
 * @Author Jim Han
 * @Date 2020/2/21
 * @Version V1.0
 **/
public class ArrayUtils {

    /**
     * 判断数组是否非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
