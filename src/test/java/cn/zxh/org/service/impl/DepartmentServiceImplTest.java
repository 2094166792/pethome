package cn.zxh.org.service.impl;

import cn.zxh.App;
import cn.zxh.basic.PageList;
import cn.zxh.org.domain.Department;
import cn.zxh.org.domain.Employee;
import cn.zxh.org.query.DepartmentQuery;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
class DepartmentServiceImplTest {
    @Autowired
    private DepartmentServiceImpl service;
    @Test
    void findById() {
        Department byId = service.findById(1L);
        System.out.println(byId);
    }

    @Test
    void findAll() {
        List<Department> all = service.findAll();
        all.forEach(System.out::println);
    }

    @Test
    void add() {
        Department department = new Department();
        Employee employee = new Employee();
        employee.setId(333L);
        department.setEmployee(employee);
        department.setDirPath("/2/10/");
        department.setParentId(2L);
        service.add(department);

    }

    @Test
    void update() {
    }

    @Test
    void del() {
        service.del(11L);
    }

    @Test
    void queryDepartment() {
        DepartmentQuery query = new DepartmentQuery();
        query.setCurrentPage(2);
        query.setPageSize(10);

        PageList<Department> pageList = service.queryDepartment(query);
        System.out.println("总条数："+ pageList.getTitles());
        System.out.println("数据：" );
        pageList.getDatas().forEach(System.out::println);
    }
}