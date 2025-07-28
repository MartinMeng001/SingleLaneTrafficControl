package com.traffic.control.common.exception;

/**
 * 交通控制系统基础异常
 */
public class TrafficControlException extends RuntimeException {
    private String errorCode;
    private Object[] args;

    public TrafficControlException(String message) {
        super(message);
    }

    public TrafficControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public TrafficControlException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public TrafficControlException(String errorCode, String message, Object... args) {
        super(message);
        this.errorCode = errorCode;
        this.args = args;
    }

    public String getErrorCode() { return errorCode; }
    public Object[] getArgs() { return args; }
}

