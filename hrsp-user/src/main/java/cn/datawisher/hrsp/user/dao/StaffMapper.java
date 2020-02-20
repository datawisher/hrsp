package cn.datawisher.hrsp.user.dao;

import cn.datawisher.hrsp.user.domain.entity.Staff;

import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Staff record);

    int insertSelective(Staff record);

    Staff selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

    List<Staff> findAll();

    /**
     * 分页查询
     * @return
     */
    List<Staff> findByPage();
}