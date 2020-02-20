package cn.datawisher.common.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * @ClassName IOUtils
 * @Description IO工具类
 * @Author Jim Han
 * @Date 2020/2/20
 * @Version V1.0
 **/
public class IOUtils {

    /**
     * 关闭对象，连接
     * @param closeable
     */
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}
