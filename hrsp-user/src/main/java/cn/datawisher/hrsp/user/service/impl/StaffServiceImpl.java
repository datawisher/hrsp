package cn.datawisher.hrsp.user.service.impl;

import cn.datawisher.common.page.MybatisPageHelper;
import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;
import cn.datawisher.hrsp.user.dao.StaffMapper;
import cn.datawisher.hrsp.user.domain.entity.Staff;
import cn.datawisher.hrsp.user.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName StaffServiceImpl
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/19
 * @Version V1.0
 **/
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StaffServiceImpl implements StaffService {

    private final StaffMapper staffMapper;

    @Override
    public int save(Staff staff) {
        return staffMapper.insertSelective(staff);
    }

    @Override
    public int delete(Staff staff) {
        return 0;
    }

    @Override
    public int delete(List<Staff> staffs) {
        return 0;
    }

    @Override
    public Staff findById(Integer id) {
        return staffMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Staff> findAll() {
        return staffMapper.findAll();
    }

    @Override
    public PageResult findByPage(PageRequest pageRequest) {
        return MybatisPageHelper.findByPage(pageRequest, staffMapper);
    }

}
