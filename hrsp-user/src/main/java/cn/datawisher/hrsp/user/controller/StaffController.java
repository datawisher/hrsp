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
@RequestMapping("/staff")
public class StaffController {

    private final StaffService staffService;

    @GetMapping("/{id}")
    public Staff findById(@PathVariable(name = "id") Long id) {
        return staffService.findById(id);
    }

    @GetMapping("/all")
    public List<Staff> findAll() {
        return staffService.findAll();
    }

    @PostMapping("/page")
    public PageResult findByPage(@RequestBody PageRequest pageRequest) {
        return staffService.findByPage(pageRequest);
    }

}
