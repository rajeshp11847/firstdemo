package com.rajesh.firstdemo.exceptionhandling;

import java.util.NoSuchElementException;

public class MyNoSuchElementException extends NoSuchElementException {
    public MyNoSuchElementException(String msg){
        super(msg);
    }

    @Override
    public String toString() {
        return "No message available...";
    }
}
