package com.company;

public class DatumNijeValidanException extends RezervacijaException {

    public DatumNijeValidanException() {
    }

    public DatumNijeValidanException(String message) {
        super(message);
    }

    public DatumNijeValidanException(String message, Throwable cause) {
        super(message, cause);
    }

    public DatumNijeValidanException(Throwable cause) {
        super(cause);
    }

    public DatumNijeValidanException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
