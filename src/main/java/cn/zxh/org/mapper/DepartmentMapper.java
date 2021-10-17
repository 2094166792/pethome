package cn.zxh.org.mapper;

import cn.zxh.org.domain.Department;
import cn.zxh.org.query.DepartmentQuery;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName DepertmentMapper
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 14:08
 * @Version 1.0
 */
@Component
public interface DepartmentMapper {
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
     * 通过高级查询条件获取总条数
     * @param query
     * @return
     */
    Integer countByQuery(DepartmentQuery query);

    /**
     * 通过高级查询获取部门数据
     * @param query
     * @return
     */
    List<Department> findAllByQuery(DepartmentQuery query);
}
