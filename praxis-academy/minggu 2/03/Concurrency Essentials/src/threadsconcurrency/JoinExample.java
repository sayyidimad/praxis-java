/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsconcurrency;

import java.util.Random;

/**
 *
 * @author sayyid
 */
public class JoinExample implements Runnable {

    private Random rand = new Random(System.currentTimeMillis());

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new JoinExample(), "joinThread-" + i);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        System.out.println("[" + Thread.currentThread().getName() + "] All threads have finished.");
    }

    @Override
    public void run() {
//        simulate some CPU expensive task
        for (int i = 0; i < 100000000; i++) {
            rand.nextInt();
        }
        System.out.println("[" + Thread.currentThread().getName() + "] finished.");
    }
}
