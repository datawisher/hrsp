package cn.datawisher.common.service;

import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;

import java.util.List;

/**
 * @ClassName CurdService
 * @Description 通用 CURD 接口
 * @Author Jim Han
 * @Date 2020/2/19
 * @Version V1.0
 **/
public interface CurdService<T> {

    /**
     * 新增操作
     * @param record
     * @return
     */
    int add(T record);

    /**
     * 修改操作
     * @param record
     * @return
     */
    int edit(T record);

    /**
     * 删除操作
     * @param record
     * @return
     */
    int delete(T record);

    /**
     * 批量删除操作
     * @param records
     * @return
     */
    int delete(List<T> records);

    /**
     * 根据 ID 查询
     * @param id
     * @return
     */
    T findById(Integer id);

    /**
     * 查找所有记录
     * @return
     */
    List<T> findAll();

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    PageResult findByPage(PageRequest pageRequest);
}
