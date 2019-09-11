/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howtodoinjava.multirunnable;

import java.util.List;

/**
 *
 * @author sayyid
 */
public class MultiRunnable implements Runnable {
    private final List<Runnable> runnables;

    public MultiRunnable(List<Runnable> runnables) {
        this.runnables = runnables;
    }

    @Override
    public void run() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (Runnable runnable : runnables) {
            new Thread(runnable).start();
        }
    }
    
}
