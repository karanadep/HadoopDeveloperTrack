package com.cloudwick.training.core.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cloudwickguest on 8/4/16.
 */
public class ExecutorsUtil {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);
//        long st = System.currentTimeMillis();
        for(int i = 0; i < 1000; i++){
            FileProcessing fobj = new FileProcessing("Dir" + i);
            fobj.setName("Cloudwick " + i);
            service.execute(fobj);
        }
        service.shutdown();
        do {

        } while (!service.isTerminated());
        System.out.println("All threads terminated");
//        long et = System.currentTimeMillis();
//        System.out.println(et - st);
    }
}