package cn.datawisher.common.util;

/**
 * @ClassName StringUtils
 * @Description 字符串工具类
 * @Author Jim Han
 * @Date 2020/2/20
 * @Version V1.0
 **/
public class StringUtils {
    /**
     * 判空操作
     * @param value
     * @return
     */
    public static boolean isBlank(String value) {
        return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
    }
}
