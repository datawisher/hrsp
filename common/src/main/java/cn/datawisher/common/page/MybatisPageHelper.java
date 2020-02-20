package cn.datawisher.common.page;

import cn.datawisher.common.util.ReflectionUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ClassName MybatisPageHelper
 * @Description MyBatis 分页查询助手
 * @Author Jim Han
 * @Date 2020/2/19
 * @Version V1.0
 **/
public class MybatisPageHelper {

    public static final String findByPage = "findByPage";

    public static PageResult findByPage(PageRequest pageRequest, Object mapper) {
        return findByPage(pageRequest, mapper, findByPage);
    }

    public static PageResult findByPage(PageRequest pageRequest, Object mapper, String queryMethodName, Object... args) {
        // 设置分页参数
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        // 利用反射调用查询方法
        Object result = ReflectionUtils.invoke(mapper, queryMethodName, args);
        return getPageResult(pageRequest, new PageInfo((List) result));
    }

    /**
     * 将分页信息封装到统一的接口
     * @param pageRequest
     * @param pageInfo
     * @return
     */
    private static PageResult getPageResult(PageRequest pageRequest, PageInfo<?> pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
