package com.sjj.thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

    public static void main(String[] args) throws Exception{

        CountDownLatch countDownLatch = new CountDownLatch(3);
        new Thread(() ->{
            System.out.println("" + Thread.currentThread().getName()+"-正在执行");
            System.out.println(""+Thread.currentThread().getName()+"-执行结束");
        },"t1").start();
        new Thread(() ->{
            System.out.println("" + Thread.currentThread().getName()+"-正在执行");
            System.out.println(""+Thread.currentThread().getName()+"-执行结束");
        },"t2").start();
        new Thread(() ->{
            System.out.println("" + Thread.currentThread().getName()+"-正在执行");
            System.out.println(""+Thread.currentThread().getName()+"-执行结束");
        },"t3").start();
        countDownLatch.await();
        System.out.println("所有线程执行完毕");
    }
}
