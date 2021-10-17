package cn.zxh.basic;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PageList
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 14:27
 * @Version 1.0
 */
@Data
public class PageList<T> {
    private Integer titles;

    private List<T> datas =new ArrayList<>();
}
