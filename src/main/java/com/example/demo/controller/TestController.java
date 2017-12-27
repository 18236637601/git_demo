/**
 * Copyright(C) 2017 Hangzhou Differsoft Co., Ltd. All rights reserved.
 *
 */
package com.example.demo.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.myinterface.Formula;

//import com.example.demo.myinterface;

/**
 * jdk8的新特性
 * 
 * @since 2017年12月20日 下午3:25:14
 * @author Fengxb
 *
 */
@RestController
@RequestMapping(value = "/test")
// @RequestMapping(value = "/operation", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@ComponentScan
public class TestController {

    @RequestMapping("/temp")
    public String getErrorCode() {
        // Comparator<String> c = (a, b) -> Integer.compare(a.length(), b.length());
        // System.out.println(c);
        Runnable r = () -> {
            System.out.println("Running");
        };
        return r.toString();
    }

    /**
     * Formula接口在拥有calculate方法之外同时还定义了sqrt方法，实现了Formula接口的子类只需要实现一个calculate方法，默认方法sqrt将在子类上可以直接使用
     * 
     * @return
     */
    @RequestMapping("/temp2")
    public String temp2() {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {

                return sqrt(a * 100);
            }
        };
        double calculate = formula.calculate(100);// 100
        double sqrt = formula.sqrt(16);
        System.out.println("calculate        " + calculate);
        System.out.println("sqrt          " + sqrt);
        return "";
    }
}
