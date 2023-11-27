package com.owen.project.frame.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wenqiang
 * @date 2023/10/25 19:27
 **/
@SpringBootApplication(scanBasePackages = "com.owen.project.frame")
public class ProjectStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectStartApplication.class, args);
    }
}