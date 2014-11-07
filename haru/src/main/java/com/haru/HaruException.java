package com.haru;

public class HaruException extends Exception {

    public static final int USERNAME_MISSING = 200;

    private int code;

    public HaruException(String message) {
        super(message);
    }

    public HaruException(int code, String message) {
        super(message);
        this.code = code;
    }

    public HaruException(String message, Throwable cause) {
        super(message, cause);
        this.code = -1;
    }

    public HaruException(Throwable cause) {
        super(cause);
        this.code = -1;
    }

    public int getErrorCode() {
        return code;
    }

    @Override
    public String getMessage() {
        if (getCause() != null) {
            return super.getMessage() + " : " + getCause().getMessage();
        }
        return super.getMessage();
    }
}
