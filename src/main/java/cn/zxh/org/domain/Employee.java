package cn.zxh.org.domain;

import lombok.Data;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 14:54
 * @Version 1.0
 */
@Data
public class Employee {
    private Long id;
    private String username;
    private String email;
    private String phone;
    private String salt;
    private String password;
    private Integer age;
    private Integer state;
    private Long departmentId;
    private Long logininfoId;
    private Long shopId;
}
