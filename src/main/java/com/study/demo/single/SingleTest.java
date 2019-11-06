package com.study.demo.single;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 10:32
 */
public class SingleTest {

    public static void main(String[] args) {
//        Singleton singleton1=Singleton.getInstance();
//        Singleton singleton2=Singleton.getInstance();
//        System.out.println(singleton1);
//        System.out.println(singleton2);
//        System.out.println(singleton1==singleton2);

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                SyncSingleton singleton1=SyncSingleton.getInstance();
                System.out.println(singleton1);
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                SyncSingleton singleton2=SyncSingleton.getInstance();
                System.out.println(singleton2);
            }
        });
       t1.start();
       t2.start();

    }


}
