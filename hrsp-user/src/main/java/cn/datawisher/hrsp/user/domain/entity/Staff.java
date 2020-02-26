package cn.datawisher.hrsp.user.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Staff implements Serializable {

    private static final long serialVersionUID = 2713542837335064376L;

    private Integer id;

    private String code;

    private String name;

    private String mobile;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String companyCode;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;

    private String createBy;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateDate;

    private String updateBy;

}