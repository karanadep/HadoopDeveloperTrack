package com.cloudwick.training.core.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Created by cloudwickguest on 8/4/16.
 */
public class FileProcessing extends Thread {
    private File child;
    private String outputPath;

    public FileProcessing (File child,String outputPath){
        this.child = child;
        this.outputPath = outputPath;
    }
    @Override
    public void run(){
        //todo Loop through and read files data in directory
        /*
        * Create folder FileProcessingDir
        * add output to file "output.txt"
        * at the end of output.txt : ADD all and print total
        * RandomAccessFile
        * */

        //list files
        File[] child1 = this.child.listFiles();

        if (child1 != null) {
            for (File child2 : child1) {
                //read content of each file
                try {
                    this.readFromFile(child2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        System.out.println("Analysed dir: " + this.child.getName() + " Thread: " + Thread.currentThread());
        //

    }

    public void readFromFile(File child2) throws IOException {
        RandomAccessFile file = new RandomAccessFile(child2, "r");
        String line;
        try {
            while ((line = file.readLine()) != null) {
                RandomAccessWriter.getInstance().writeToFile(line, this.outputPath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
