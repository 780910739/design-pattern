package com.study.demo.single;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 10:34
 */
public class SyncSingleton {


    private static SyncSingleton Instance;

    public static synchronized SyncSingleton getInstance(){
        if(Instance==null){
            synchronized(SyncSingleton.class){
                Instance=new SyncSingleton();
            }
        }
        return Instance;
    }


}
