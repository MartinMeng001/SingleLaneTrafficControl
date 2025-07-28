package com.traffic.control.common.exception;

/**
 * 通信异常
 */
public class CommunicationException extends TrafficControlException {
    public CommunicationException(String message) {
        super("COMM_ERROR", message);
    }

    public CommunicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
