package com.chen.thread.ThreadVsRunnable;

class Thread3 extends Thread {
    private String threadName;
    private int ticket = 5;

    public Thread3(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            synchronized (this) {
                if (ticket > 0){
                    System.out.println(threadName + "运行，此时的 i = " + i+" 剩余票数" + this.ticket--);
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

public class ErrThread {
    public static void main(String[] args){
        Thread3 thread1 = new Thread3("我是在A线程中");
        Thread3 thread2 = new Thread3("我是在B线程中");
        Thread3 thread3 = new Thread3("我是在C线程中");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}