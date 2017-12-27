/**
 * Copyright(C) 2017 Hangzhou Differsoft Co., Ltd. All rights reserved.
 *
 */
package com.example.demo.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * jdk8字符串排列
 * 
 * @since 2017年12月26日 下午4:15:27
 * @author Fengxb
 *
 */
@RestController
@RequestMapping(value = "/lambda")
public class LambdaController {

    @RequestMapping(value = "/comparator")
    public String comparator() {

        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        // 原来排列字符串
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
                // return a.compareTo(b);
            }
        });

        // java8中排列字符串,怎么拍正序
        // Collections.sort(names, (String a, String b) -> b.compareTo(a));
        return null;
    }
}
