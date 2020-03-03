package com.bro.cloud;

/**
 * @ClassName:DemoThread
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/26 8:06
 * @Version:V1.0
 */
public class DemoThread extends Thread {
    @Override
    public void run() {

        try {
            Thread.sleep(2000);
            Demo2 demo2 = Demo2.getDemo2();
            System.out.println(demo2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
