/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mitz
 */
public class ThreadSafety {

    public static void main(String[] args) throws InterruptedException {
        ProcessThreads pt = new ProcessThreads();
        Thread t1 = new Thread(pt);
        Thread t2 = new Thread(pt);
//        t1.start();
//        t2.start();
//        t1.join();
//        t2.join();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println(pt.getCount());
    }

}

class ProcessThreads implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count++;
        }
    }

    public int getCount() {
        return count;
    }

    private void processSomething(int i) {
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
