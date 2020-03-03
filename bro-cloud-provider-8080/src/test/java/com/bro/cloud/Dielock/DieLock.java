package com.bro.cloud.Dielock;

/**
 * @ClassName:DieLock
 * @Description:TODO
 * @Author:admin
 * @Date:2020/2/25 21:32
 * @Version:V1.0
 */
public class DieLock extends Thread {
    public static final Object objA = new Object();
    public static final Object objB = new Object();

    public Boolean flag;

    public DieLock(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (objA) {
                System.out.println(Thread.currentThread().getName() + "if:objA");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (objB) {
                    System.out.println(Thread.currentThread().getName() + "if:objB");

                }

            }

        } else {
            synchronized (objB) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "else:objB");
                synchronized (objA) {
                    System.out.println(Thread.currentThread().getName() + "else:objA");

                }

            }

        }


    }
}
