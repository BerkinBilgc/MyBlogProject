package com.berknbilgc.exception;

import javax.validation.constraints.Min;

public class BerkinBilgicException extends Exception{
    public BerkinBilgicException(String message) {
        super(message);
    }
}
