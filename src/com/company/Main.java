package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        TwoThreads t1=new TwoThreads();
        TwoThreads t2=new TwoThreads();
        TwoThreads t3=new TwoThreads();
        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(5);
            t1.start();
            //  t1.setName("My first Thread");
            // System.out.println((t1.getName()));
           // t1.join();
            t2.start();
            //  t2.setName("My Second Thread");
            //  System.out.println(t2.getName());
            t3.start();
            //  t3.setName("My Third Thread");
            //System.out.println(t3.getName());


    }
}
