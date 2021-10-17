package cn.zxh.org.domain;

import lombok.Data;

/**
 * @ClassName LoginInfo
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 16:07
 * @Version 1.0
 */
@Data
public class LoginInfo {
    private Long id;
    private String username;
    private String phone;
    private String email;
    private String salt;
    private String password;
    private Boolean type;
    private Boolean disable;
}
