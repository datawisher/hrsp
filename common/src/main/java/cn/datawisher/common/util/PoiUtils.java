package cn.datawisher.common.util;

import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;

/**
 * @ClassName PoiUtils
 * @Description POI工具类
 * @Author Jim Han
 * @Date 2020/2/20
 * @Version V1.0
 **/
public class PoiUtils {

    /**
     * 生成Excel文件
     * @param workbook
     * @param fileName
     * @return
     */
    public static File createExcelFile(Workbook workbook, String fileName) {
        OutputStream stream = null;
        File file = null;
        try {
            file = File.createTempFile(fileName, ".xlsx");
            stream = new FileOutputStream(file.getAbsoluteFile());
            workbook.write(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(workbook);
            IOUtils.closeQuietly(stream);
        }
        return file;
    }
}
