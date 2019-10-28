package com.sjj.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName CyclicBarrierTest
 * @Description TODO
 * Author shengjunjie
 * Date 2019/10/28 17:00
 **/
public class CyclicBarrierTest extends Thread {
    @Override
    public void run() {
        System.out.println("开始进行数据分析");
    }

    public static void main(String[] args) {
        CyclicBarrier cycliBarrier=new CyclicBarrier(3,new CyclicBarrierTest());
        new Thread(new DataImportThread(cycliBarrier,"file1")).start();
        new Thread(new DataImportThread(cycliBarrier,"file2")).start();
        new Thread(new DataImportThread(cycliBarrier,"file3")).start();
    }
}
