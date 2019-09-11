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
public class InterruptExample implements Runnable {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread myThread = new Thread(new InterruptExample(), "myThread");
        myThread.start();

        System.out.println("[" + Thread.currentThread().getName() + "] Sleeping in main thread for 5s...");
        Thread.sleep(5000);

        System.out.println("[" + Thread.currentThread().getName() + "] Interrupting myThread");
        myThread.interrupt();

        System.out.println("[" + Thread.currentThread().getName() + "] Sleeping in main thread for 5s...");
        Thread.sleep(5000);

        System.out.println("[" + Thread.currentThread().getName() + "] Interrupting myThread");
        myThread.interrupt();

    }

    @Override
    public void run() {
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] Interrupted by exception!");
        }
        while (!Thread.interrupted()) {
//            do nothing here
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Interrupted for the second time.");
    }

}
