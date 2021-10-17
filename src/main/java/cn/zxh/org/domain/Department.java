package cn.zxh.org.domain;

import lombok.Data;

/**
 * @ClassName Department
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 12:00
 * @Version 1.0
 */
@Data
public class Department {
    private Long id;
    private String sn;
    private String name;
    private String dirPath;
    private Integer state;
    private Long managerId;
    private Employee employee;
    private Long parentId;

    public String setName(String name){
       return this.name = name.trim();
    }
}
