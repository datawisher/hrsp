package cn.datawisher.hrsp.order.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName StaffDTO
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/26
 * @Version V1.0
 **/
@Data
public class StaffDTO implements Serializable {

    private static final long serialVersionUID = 4065524722193750636L;

    private Integer id;

    private String code;

    private String name;

    private String mobile;

    private String birthday;

    private String companyCode;

    private String createDate;

    private String createBy;

    private String updateDate;

    private String updateBy;
}