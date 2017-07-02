package com.chen.thread.ThreadVsRunnable;

/**
 * Created by Sean on 2017/5/9.
 */
class Thread5 extends Thread {

    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(currentThread().getName() + "运行，此时的 i = " + i + " 剩余票数" + this.ticket--);
                }
            }
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class TrueThread {
    public static void main(String[] args) {
        Thread5 thread1 = new Thread5();
        new Thread(thread1, "我是在A线程中").start();
        new Thread(thread1, "我是在B线程中").start();
        new Thread(thread1, "我是在C线程中").start();
        System.out.println(true);
    }
}