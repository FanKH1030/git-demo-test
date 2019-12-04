package com.bea.lambda;

/**
 * Created by fandi on 2019/11/28 0028.
 */
public class LambdaTest {

    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"运行了");
            }
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"多线程任务执行！");
        }).start(); // 启动线程

        new Thread(()->System.out.println(Thread.currentThread().getName()+"运行了")).start();
    }
}
