package com.bro.cloud;

/**
 * @ClassName:Demo 饿汉式
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/26 7:56
 * @Version:V1.0
 */
public class Demo {

    private Demo() {
    }

    private static Demo demo = new Demo();

    public static Demo getDemo() {
        return demo;
    }

}
