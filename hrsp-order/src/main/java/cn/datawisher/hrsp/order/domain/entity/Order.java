package cn.datawisher.hrsp.order.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Order
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/23
 * @Version V1.0
 **/
@Data
@Entity(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = -3321199319770589279L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String staffCode;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createDate;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateDate;

}
