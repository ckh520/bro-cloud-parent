package com.bro.cloud;

/**
 * @ClassName:DemoTest
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/26 7:59
 * @Version:V1.0
 */
public class DemoTest {
    public static void main(String[] args) {
//        Demo demo1 = Demo.getDemo();
//        Demo demo = Demo.getDemo();
//        System.out.println(demo == demo1);


//        Demo2 demo2 =Demo2.getDemo2();
//        Demo2 demo3 =Demo2.getDemo2();
//        System.out.println(demo2==demo3);


        DemoThread thread = new DemoThread();
        DemoThread thread2 = new DemoThread();
        thread.start();
        thread2.start();


    }
}
