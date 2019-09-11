/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtodoinjava.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author sayyid
 */
public class DemoExecutorUsage {

    private static ExecutorService executor = null;
    private static volatile Future taskOneResults = null;
    private static volatile Future taskTwoResults = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        executor = Executors.newFixedThreadPool(2);
        while (true) {
            try {
                checkTasks();
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("Caught exception: " + e.getMessage());
            }
        }
    }

    private static void checkTasks() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (taskOneResults == null || taskOneResults.isDone() || taskOneResults.isCancelled()) {
            taskOneResults = executor.submit(new TestOne());
        }

        if (taskTwoResults == null || taskTwoResults.isDone() || taskOneResults.isCancelled()) {
            taskTwoResults = executor.submit(new TestTwo());
        }
    }
}

class TestOne implements Runnable {

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (true) {
            System.out.println("Executing task one");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}

class TestTwo implements Runnable {
    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        while (true) {            
            System.out.println("Executing task two");
            try {
                Thread.sleep(1000);
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
    }
}