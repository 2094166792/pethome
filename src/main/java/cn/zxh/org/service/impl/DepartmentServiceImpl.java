package cn.zxh.org.service.impl;

import cn.zxh.basic.PageList;
import cn.zxh.org.domain.Department;
import cn.zxh.org.mapper.DepartmentMapper;
import cn.zxh.org.query.DepartmentQuery;
import cn.zxh.org.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.Action;
import java.util.List;

/**
 * @ClassName DepartmentServiceImpl
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 14:59
 * @Version 1.0
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public Department findById(Long id) {
        return departmentMapper.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }

    @Override
    @Transactional
    public void add(Department department) {
        departmentMapper.add(department);
    }

    @Override
    @Transactional
    public void update(Department department) {
        departmentMapper.update(department);
    }

    @Override
    @Transactional
    public void del(Long id) {
        departmentMapper.del(id);
    }

    @Override
    public PageList<Department> queryDepartment(DepartmentQuery query) {
        Integer count = departmentMapper.countByQuery(query);
        List<Department> rows = departmentMapper.findAllByQuery(query);
        PageList<Department> pageList = new PageList<>();
        pageList.setTitles(count);
        pageList.setDatas(rows);
        return pageList;
    }
}
