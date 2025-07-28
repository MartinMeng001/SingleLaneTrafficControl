package com.traffic.control.common.exception;

public class DataParseException extends ProtocolException {
    public DataParseException(String message) {
        super(message);
    }

    public DataParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
