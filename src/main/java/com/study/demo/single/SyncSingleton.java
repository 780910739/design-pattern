package com.study.demo.single;

/**
 * @Author pukaiquan
 * @Date 2019-11-06 10:34
 */
public class SyncSingleton {


    private static SyncSingleton Instance;

    public static SyncSingleton getInstance(){
        synchronized(SyncSingleton.class){
            if(Instance==null) {
                Instance = new SyncSingleton();
            }
        }
        return Instance;
    }


}
