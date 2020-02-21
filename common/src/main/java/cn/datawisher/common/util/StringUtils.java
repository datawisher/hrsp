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
     * 字符串分隔符
     */
    public static final String SEPARATOR = String.valueOf((char) 29);

    /**
     * 判空操作
     * @param value
     * @return
     */
    public static boolean isBlank(String value) {
        return value == null || "".equals(value) || "null".equals(value) || "undefined".equals(value);
    }

    /**
     * 判非空操作
     */
    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    /**
     * 分割固定格式的字符串
     */
    public static String[] splitString(String str, String separator) {
        return org.apache.commons.lang3.StringUtils.splitByWholeSeparator(str, separator);
    }


}
