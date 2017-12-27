/**
 * Copyright(C) 2017 Hangzhou Differsoft Co., Ltd. All rights reserved.
 *
 */
package com.example.demo.myinterface;

import org.springframework.stereotype.Component;

/**
 * java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法
 * 
 * @since 2017年12月26日 下午3:56:46
 * @author Fengxb
 */
@Component
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
