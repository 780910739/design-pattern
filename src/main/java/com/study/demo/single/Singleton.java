package com.study.demo.single;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 10:32
 */
public class Singleton {

    private static class SingletonHolder{
        public static final Singleton Instance=new Singleton();
    }

    public static final Singleton getInstance(){
        return SingletonHolder.Instance;
    }

}
