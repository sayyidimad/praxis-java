/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsconcurrency;

import java.lang.Thread.State;

/**
 *
 * @author sayyid
 */
public class MainThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long id = Thread.currentThread().getId();
        String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        State state = Thread.currentThread().getState();
        String threadGroupName = Thread.currentThread().getThreadGroup().getName();
        System.out.println("id =" + id + "\t");
        System.out.println("name = " + name + "\t");
        System.out.println("priority = " + priority + "\t");
        System.out.println("state = " + state + "\t");
        System.out.println("threadGroupName = " + threadGroupName);
    }
    
}
