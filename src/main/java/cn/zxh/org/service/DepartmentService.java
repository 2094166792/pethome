package cn.zxh.org.service;

import cn.zxh.basic.PageList;
import cn.zxh.org.domain.Department;
import cn.zxh.org.query.DepartmentQuery;

import java.util.List;

/**
 * @ClassName DepartmentService
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 14:55
 * @Version 1.0
 */

public interface DepartmentService {
    /**
     * 通过id查询部门
     * @param id
     * @return
     */
    Department findById(Long id);

    /**
     * 查询所有部门
     * @return
     */
    List<Department> findAll();

    /**
     * 添加部门
     * @param department
     */
    void add(Department department);

    /**
     * 修改部门信息
     * @param department
     */
    void update(Department department);

    /**
     * 通过id删除部门信息
     * @param id
     */
    void del(Long id);

    /**
     * 通过高级查询数据查询每页数据信息
     * @param query
     * @return
     */
    PageList<Department> queryDepartment(DepartmentQuery query);
}
