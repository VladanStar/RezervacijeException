package com.company;

public class ImeNijeValidnoException extends RezervacijaException {

    public ImeNijeValidnoException() {
    }

    public ImeNijeValidnoException(String message) {
        super(message);
    }

    public ImeNijeValidnoException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImeNijeValidnoException(Throwable cause) {
        super(cause);
    }

    public ImeNijeValidnoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
