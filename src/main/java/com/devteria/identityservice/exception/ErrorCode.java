package com.devteria.identityservice.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION (9999, "Uncategorized error"),
    USER_EXISTED (1002, "User existed.")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
