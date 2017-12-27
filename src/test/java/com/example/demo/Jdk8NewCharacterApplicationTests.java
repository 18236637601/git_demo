package com.example.demo;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.myinterface.Converter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Jdk8NewCharacterApplicationTests {

    /**
     * 方法与构造函数引用 两种类型的互转
     */
    @Test
    public void contextLoads() {
        // /Java 8 允许你使用 :: 关键字来传递方法或者构造函数引用
        // Person::new 来获取Person类构造函数的引用，
        // something::startsWith;引用对象
        // 引用静态方法
        Converter<String, Integer> converter = Integer::valueOf;
        Integer convert = converter.convert("123");
        // converter = somthing::startsWith;
        System.out.println(convert);
    }

    /**
     * 直接在lambda表达式中访问外层的局部变量：
     */
    @Test
    public void contextLoads2() {
        // 但是和匿名对象不同的是，这里的变量num可以不用声明为final，该代码同样正确：
        // final int num = 1;
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        String convert = stringConverter.convert(2);
        System.out.println(convert);// 3
    }

    @Test
    public void contextLoads3() {
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach((id, val) -> System.out.println(val));
        System.out.println(map.size());
    }

}
