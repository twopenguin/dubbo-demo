package com.zcd.dubbo.exception;

public class HelloException extends RuntimeException{
    public HelloException() {
    }

    public HelloException(String message) {
        super(message);
    }
}
