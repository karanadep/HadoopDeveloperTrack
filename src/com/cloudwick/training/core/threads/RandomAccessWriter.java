package com.cloudwick.training.core.threads;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by cloudwickguest on 8/10/16.
 */
public class RandomAccessWriter {
    private static RandomAccessWriter instance = null;
    protected RandomAccessWriter(){

    }
    public static RandomAccessWriter getInstance(){
        if(instance == null) {
            instance = new RandomAccessWriter();
        }
        return instance;
    }
    public void writeToFile(String data, String outputPath) throws IOException {
        File f = new File(outputPath);
        long fileLength = f.length();
        RandomAccessFile file = new RandomAccessFile(outputPath, "rw");
        file.seek(fileLength);
        if(fileLength != 0){
            file.write(0x0d); //New Line
            file.write(0x0a); //Carriage return
        }
        file.writeBytes(data);
    }
}
