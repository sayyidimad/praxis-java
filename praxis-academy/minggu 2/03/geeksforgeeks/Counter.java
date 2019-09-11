/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author sayyid
 */
// Java program depicting
// concurrent programming in action.

// Runnable Class that defines the logic
// of run method of runnable interface
public class Counter implements Runnable {
    private final MainApp mainApp;
    private final int loopLimit;
    private final String task;

//    Constructor to get a reference to the main class
    public Counter(MainApp mainApp, int loopLimit, String task) {
        this.mainApp = mainApp;
        this.loopLimit = loopLimit;
        this.task = task;
    }

//    Prints the thread name, task number and
//    the value of counter
//    Calls pause method to allow multithreading to occur
    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < loopLimit; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " Counter: " + (i + 1) + " Task: " + task);
            mainApp.pause(Math.random());
        }
    }    
}


class MainApp {
//    Starts the threads. Pool size 2 means at any time
//    there can only be two simultaneous threads
    public void startThread(){
        ExecutorService taskList = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
//            Makes tasks available for execution.
//            At the appropriate time, calls run
//            method of runnable interface
            taskList.execute(new Counter(this, i + 1, "task " + (i + 1)));
        }
        
//        Shuts the thread that's watching to see if
//        you have added new tasks.
        taskList.shutdown();
    }

//    Pauses execution for a moment
//    so that system switches back and forth
    void pause(double seconds) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try {
            Thread.sleep(Math.round(1000.0 * seconds));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
//    Driver method
    public static void main(String[] args) {
        new MainApp().startThread();
    }
}