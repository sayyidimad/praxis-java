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
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Executing thread " + Thread.currentThread().getName());
    }
    
    

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        MyThread myThread = new MyThread("myThread");
        myThread.start();
    }
    
}
