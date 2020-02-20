package cn.datawisher.hrsp.product.domain.entity;

import java.util.Date;
import javax.persistence.*;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")
public class Product {
    /**
     * 产品ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    /**
     * 产品编号
     */
    private String code;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 产品类型
     */
    private String type;

    /**
     * 产品所属地
     */
    private String region;

    /**
     * 创建日期
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;

    /**
     * 更新日期
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;
}