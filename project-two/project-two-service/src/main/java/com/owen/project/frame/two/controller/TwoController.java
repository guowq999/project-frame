package com.owen.project.frame.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenqiang
 * @date 2023/10/25 18:14
 **/
@RestController
@RequestMapping("/two")
public class TwoController {

    @GetMapping("/test")
    public String test() {
        return "hello project two";
    }
}