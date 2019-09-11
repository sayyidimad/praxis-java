/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsconcurrency;

/**
 *
 * @author sayyid
 */
public class NotSynchronizedCounter implements Runnable {

    private static int counter = 0;

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new NotSynchronizedCounter(), "thread-" + i);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
    }

    @Override
    public void run() {
        while (counter < 10) {
            System.out.println("[" + Thread.currentThread().getName() + "] before: " + counter);
            counter++;
            System.out.println("[" + Thread.currentThread().getName() + "] after: " + counter);
        }
    }
}
