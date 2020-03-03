package cn.datawisher.hrsp.user.controller;

import cn.datawisher.common.http.HttpResult;
import cn.datawisher.common.logger.LogCut;
import cn.datawisher.common.page.PageRequest;
import cn.datawisher.common.page.PageResult;
import cn.datawisher.hrsp.user.domain.entity.Staff;
import cn.datawisher.hrsp.user.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName StaffController
 * @Description 
 * @Author Jim Han
 * @Date 2020/2/19
 * @Version V1.0
 **/
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/v1/staffs")
public class StaffController {

    private final StaffService staffService;

    /**
     * 按id查询
     * @param id
     * @return
     */
    @LogCut
    @GetMapping("{id}")
    public HttpResult findById(@PathVariable(name = "id") Integer id) {
        Staff staff = staffService.findById(id);
        return HttpResult.ok(staff);
    }

    /**
     * 查询全部
     * @return
     */
    @LogCut
    @GetMapping
    public HttpResult findAll() {
        List<Staff> staffs = staffService.findAll();
        return HttpResult.ok(staffs);
    }

    /**
     * 分页查询。params必须要加，不然会和findAll的url mapping冲突
     * @param page
     * @param size
     * @return
     */
    @LogCut
    @GetMapping(params = {"page", "size"})
    public HttpResult findByPage(@RequestParam final Integer page, @RequestParam final Integer size) {
        PageRequest pageRequest = new PageRequest(page, size);
        PageResult result = staffService.findByPage(pageRequest);
        return HttpResult.ok(result);
    }

    /**
     * 新增员工信息
     * @param staff
     * @return
     */
    @LogCut
    @PostMapping
    public HttpResult addStaff(@RequestBody Staff staff) {
        staffService.add(staff);
        return HttpResult.ok();
    }

    /**
     * 修改员工信息
     * @param staff
     * @return
     */
    @LogCut
    @PutMapping
    public HttpResult eidtStaff(@RequestBody Staff staff) {
        staffService.edit(staff);
        return HttpResult.ok();
    }

    /**
     * 删除员工信息
     * @param staff
     * @return
     */
    @LogCut
    @DeleteMapping
    public HttpResult deleteStaff(@RequestBody Staff staff) {
        staffService.delete(staff);
        return HttpResult.ok();
    }
}
