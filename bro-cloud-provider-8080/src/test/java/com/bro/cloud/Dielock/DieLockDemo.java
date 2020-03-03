package com.bro.cloud.Dielock;

/**
 * @ClassName:DieLockDemo
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/26 7:35
 * @Version:V1.0
 */
public class DieLockDemo {

    public static void main(String[] args) {

        DieLock dieLock1 = new DieLock(true);
        DieLock dieLock2 = new DieLock(false);
        dieLock1.setName("线程1");
        dieLock2.setName("线程2");

        dieLock1.start();
        dieLock2.start();

    }


}
