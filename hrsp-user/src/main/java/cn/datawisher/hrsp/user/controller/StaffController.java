package cn.datawisher.hrsp.user.controller;

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

    @GetMapping("{id}")
    public Staff findById(@PathVariable(name = "id") Long id) {
        return staffService.findById(id);
    }

    @GetMapping
    public List<Staff> findAll() {
        return staffService.findAll();
    }

    @GetMapping(params = {"page", "size"}) // params要加，不然会和findAll的url mapping冲突
    public PageResult findByPage(@RequestParam Integer page, @RequestParam Integer size) {
        PageRequest pageRequest = new PageRequest(page, size);
        return staffService.findByPage(pageRequest);
    }

}
