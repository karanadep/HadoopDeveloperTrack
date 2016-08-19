package com.cloudwick.training.core.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;

/**
 * Created by cloudwickguest on 8/4/16.
 */
public class ThreadUtil {
/*    public static void main(String[] args){
        List<Thread> threadLA = new ArrayList<>();
        for(int i = 0; i < 1000; i++){
            FileProcessing fobj = new FileProcessing("Dir" + i);
            fobj.setName("Cloudwick " + i);
            if (i > 50 && i < 100) {
                fobj.setPriority(Thread.MIN_PRIORITY);
            }
            fobj.start();
        }
        int running;
        do {
            running = 0;
            for (Thread t: threadLA) {
                if(t.isAlive()) {
                    running++;
                }
            }
        } while (running != 0);
        System.out.println("All threads terminated");
    }*/
}
