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
public class MyRunnable implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread myThread = new Thread(new MyRunnable(), "myRunnable");
        myThread.start();
    }

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Executing thread " + Thread.currentThread().getName());
    }
    
}
