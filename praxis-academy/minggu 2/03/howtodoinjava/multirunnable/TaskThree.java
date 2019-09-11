/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtodoinjava.multirunnable;

/**
 *
 * @author sayyid
 */
public class TaskThree implements Runnable {

    @Override
    public void run() {
        System.out.println("Executing Task Three");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
