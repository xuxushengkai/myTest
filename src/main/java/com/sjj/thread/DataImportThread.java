package com.sjj.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName DataImportThread
 * @Description TODO
 * Author shengjunjie
 * Date 2019/10/28 16:57
 **/
public class DataImportThread extends Thread {

    private CyclicBarrier cyclicBarrier;
    private String path;

    public DataImportThread(CyclicBarrier cyclicBarrier, String path) {
        this.cyclicBarrier = cyclicBarrier;
        this.path = path;
    }

    @Override
    public void run() {
        System.out.println("开始导入："+path+"位置的数据");
        try {
            cyclicBarrier.await();//阻塞
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
