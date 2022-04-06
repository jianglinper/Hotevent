package com.s3;

import com.s3.pojo.Hotevents;
import com.s3.service.HoteventsService;
import com.s3.util.PageUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

/**
 * User: jianglin
 * Date: 2022/3/4
 * Time: 9:42
 * Desc: 启动器
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        System.out.println("`````");



    }
}
