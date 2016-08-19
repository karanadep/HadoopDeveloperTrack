package com.cloudwick.training.core.exception;

/**
 * Created by cloudwickguest on 8/2/16.
 */
public class InvalidFileException extends Exception {
    public InvalidFileException (String msg) {
        super(msg);
        //System.out.println(msg);
    }
}
