package com.capworld.formatter.exception;

public class FormatterException extends Exception {

    public FormatterException(Exception e) {
        super(e);
    }

    public FormatterException(String errorMessage, Exception e) {
        super(errorMessage, e);
    }

    public FormatterException(String errorMessage) {
        super(errorMessage);
    }

}


