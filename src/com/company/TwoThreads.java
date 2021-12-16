package com.company;

public class TwoThreads extends Thread {
    private final Object obj=new Object();
    @Override
    public void run() {

        synchronized (obj){

            for (int i=1;i<=3;i++){
                System.out.println("Running Thread name is:" + Thread.currentThread().getName());
                System.out.println("Priority of thread is:" + Thread.currentThread().getPriority());
                System.out.println("--------------------------------------------");

               // System.out.println(i);
                try{
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}



