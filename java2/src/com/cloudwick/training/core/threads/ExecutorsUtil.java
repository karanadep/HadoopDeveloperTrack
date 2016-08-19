package com.cloudwick.training.core.threads;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by cloudwickguest on 8/4/16.
 */
public class ExecutorsUtil {
    public static void main(String[] args) {

        File f = new File("FileProcessingDir");
        File[] children = f.listFiles();
        ExecutorService service = Executors.newFixedThreadPool(100);
        if(children != null) {
            for (File child : children) {
                FileProcessing fobj = new FileProcessing(child,"FileProcessingOutput/output");
                service.execute(fobj);
            }
        }
        service.shutdown();
        do {

        } while (!service.isTerminated());
        System.out.println("All threads terminated");
    }
}