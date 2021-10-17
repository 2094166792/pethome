package cn.zxh.org.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 16:14
 * @Version 1.0
 */
@Data
public class Menu {
    private Long id;
    private String name;
    private String url;
    private String icon;
    private Integer index;
    private List<Menu> children = new ArrayList<>();
}
