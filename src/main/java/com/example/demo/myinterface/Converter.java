package com.example.demo.myinterface;

/**
 * “函数式接口”是指仅仅只包含一个抽象方法的接口，每一个该类型的lambda表达式都会被匹配到这个抽象方法。因为 默认方法 不算抽象方法，所以你也可以给你的函数式接口添加默认方法。
 * 
 * 我们可以将lambda表达式当作任意只包含一个抽象方法的接口类型，确保你的接口一定达到这个要求，你只需要给你的接口添加 @FunctionalInterface
 * 注解，编译器如果发现你标注了这个注解的接口有多于一个抽象方法的时候会报错的。
 * 
 * @since 2017年12月26日 下午5:01:58
 * @author Fengxb
 *
 * @param <F>
 * @param <T>
 */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}

// Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
// Integer converted = converter.convert("123");
// System.out.println(converted); // 123