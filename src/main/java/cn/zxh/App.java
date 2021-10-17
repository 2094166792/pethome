package cn.zxh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName App
 * @Description TODO
 * @Author 魔
 * @Date 2021/10/17 14:51
 * @Version 1.0
 */
@MapperScan("cn.zxh.org.mapper")
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
