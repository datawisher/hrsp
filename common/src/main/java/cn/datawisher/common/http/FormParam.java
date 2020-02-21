package cn.datawisher.common.http;

/**
 * @ClassName FormParam
 * @Description 封装表单参数
 * @Author Jim Han
 * @Date 2020/2/21
 * @Version V1.0
 **/
public class FormParam {

    private String fieldName;
    private Object fieldValue;

    public FormParam(String fieldName, Object fieldValue) {
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
