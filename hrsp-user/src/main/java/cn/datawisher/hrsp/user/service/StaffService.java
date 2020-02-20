package cn.datawisher.hrsp.user.service;

import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;
import cn.datawisher.common.service.CurdService;
import cn.datawisher.hrsp.user.domain.entity.Staff;

import java.util.List;

public interface StaffService extends CurdService<Staff> {

    /**
     * 全部查询
     * @return
     */
    List<Staff> findAll();

    /**
     * 分页查询
     * @param pageRequest
     * @return
     */
    @Override
    PageResult findByPage(PageRequest pageRequest);
}
