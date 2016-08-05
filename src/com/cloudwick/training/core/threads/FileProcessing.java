package com.cloudwick.training.core.threads;

/**
 * Created by cloudwickguest on 8/4/16.
 */
public class FileProcessing extends Thread {
    private String dirPath;
    public FileProcessing (String dirPath) {
        this.dirPath = dirPath;
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
        System.out.println("Analysed dir: " + this.dirPath + " Thread: " + Thread.currentThread());
        //
    }
}
