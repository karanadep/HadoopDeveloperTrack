package com.cloudwick.training.core.threads;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Integer.*;

/**
 * Created by cloudwickguest on 8/5/16.
 */
public class FolderProcessing {

    private String inputPath;
    private String outputPath;
    private int outputData = 0;

    public FolderProcessing(String inputPath, String outputPath) throws IOException {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
        this.seekDirectory();
        this.countOutputData();
    }

    public void readFromFile(File child2) throws IOException {
        RandomAccessFile file = new RandomAccessFile(child2, "r");
        String line;
        try {
            while ((line = file.readLine()) != null) {
                this.writeToFile(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String data) throws IOException {
        File f = new File(this.outputPath);
        long fileLength = f.length();
        RandomAccessFile file = new RandomAccessFile(this.outputPath, "rw");
        file.seek(fileLength);
        if(fileLength != 0){
            file.write(0x0d); //New Line
            file.write(0x0a); //Carriage return
        }
        file.writeBytes(data);
    }

    public void seekDirectory() throws IOException {
        File f = new File(this.inputPath);
        File[] children = f.listFiles();

        if(children != null){
            for (File child : children) {
                //list files
                File[] child1 = child.listFiles();
                if (child1 != null) {
                    for (File child2 : child1) {
                        //read content of each file
                        readFromFile(child2);
                    }
                }
            }
        }
    }
    public void countOutputData() throws IOException {
        RandomAccessFile file = new RandomAccessFile(this.outputPath,"r");
        String line;

        while ((line = file.readLine()) != null) {
            this.outputData += parseInt(line);
        }

        this.writeToFile(new Integer(this.outputData).toString());
    }
    public static void main(String[] args) throws IOException {
        new FolderProcessing("FileProcessingDir","FileProcessingOutput/output");
    }
}
