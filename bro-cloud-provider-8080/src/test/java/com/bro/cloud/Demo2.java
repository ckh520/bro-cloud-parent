package com.bro.cloud;

/**
 * @ClassName:Demo2 懒汉式
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/26 8:00
 * @Version:V1.0
 */
public class Demo2 {

    private Demo2() {
    }

    private static Demo2 d;

    public synchronized static Demo2 getDemo2() {

        if (d == null) {
            return d = new Demo2();
        }

        return d;
    }
}
