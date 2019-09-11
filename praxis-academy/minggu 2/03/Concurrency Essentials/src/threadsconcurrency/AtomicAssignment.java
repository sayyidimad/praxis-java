/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsconcurrency;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sayyid
 */
public class AtomicAssignment implements Runnable {

    private static volatile Map<String, String> configuration = new HashMap<String, String>();

    public static void readConfig() {
        Map<String, String> newConfig = new HashMap<>();
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
        newConfig.put("key-1", sdf.format(now));
        newConfig.put("key-2", sdf.format(now));
        newConfig.put("key-3", sdf.format(now));
        configuration = newConfig;
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        readConfig();
        Thread configThread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    readConfig();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "configuration-thread");
        configThread.start();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new AtomicAssignment(), "thread-" + i);
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }
        configThread.join();
        System.out.println("[" + Thread.currentThread().getName() + "] All threads have finished.");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            Map<String, String> currConfig = configuration;
            String value1 = currConfig.get("key-1");
            String value2 = currConfig.get("key-2");
            String value3 = currConfig.get("key-3");
            if (!(value1.equals(value2) && value2.equals(value3))) {
                throw new IllegalStateException("Values are not equal.");
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
