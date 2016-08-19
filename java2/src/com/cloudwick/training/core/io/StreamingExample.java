package com.cloudwick.training.core.io;

import com.cloudwick.training.core.exception.InvalidFileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by cloudwickguest on 8/2/16.
 */
public class StreamingExample {
    public static void main(String[] args) throws InvalidFileException{
        writeContent("test cloudwick","input.txt");
    }
    public static void writeContent (String content, String filename) throws InvalidFileException {
        FileOutputStream fos = null;
        File fileobj = new File(filename);
        if(fileobj.exists()) {
            throw new InvalidFileException("Duplicate file name");
        }
        try {
            fos = new FileOutputStream(filename);

            fos.write(content.getBytes());
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //we add if statement for null pointer exceptions
            // Block of code that is always executed when the try block is exited,
            // no matter how the try block is exited.
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
