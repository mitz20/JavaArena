/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author mitz
 */
public class Threading {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            ExtendedThread extendedThread = new ExtendedThread();
            extendedThread.start();
        }
        System.out.println("break");
        for(int i=0; i<n; i++){
            Thread thread = new Thread(new ImplementedThread());
            thread.start();
        }
    }
}

class ExtendedThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
    }
}

class ImplementedThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " : " + Thread.currentThread().getId());
    }

}
