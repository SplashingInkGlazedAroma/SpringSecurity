package com.xtl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 31925
 * @className VerifyCodeApp
 * @description 主程序入口
 * @date 2022/5/10 9:31
 */
@SpringBootApplication
public class VerifyCodeApp implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(VerifyCodeApp.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("=========SpringBoot应用启动====");
    }
}
