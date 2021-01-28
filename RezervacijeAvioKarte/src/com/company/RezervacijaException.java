package com.company;

public class RezervacijaException  extends Exception{

    public RezervacijaException() {
    }

    public RezervacijaException(String message) {
        super(message);
    }

    public RezervacijaException(String message, Throwable cause) {
        super(message, cause);
    }

    public RezervacijaException(Throwable cause) {
        super(cause);
    }

    public RezervacijaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
