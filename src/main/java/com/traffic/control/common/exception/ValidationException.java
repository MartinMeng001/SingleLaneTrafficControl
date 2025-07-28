package com.traffic.control.common.exception;

/**
 * 数据验证异常
 */
public class ValidationException extends TrafficControlException {
    public ValidationException(String message) {
        super("VALIDATION_ERROR", message);
    }

    public ValidationException(String field, String message) {
        super("VALIDATION_ERROR", String.format("Field '%s': %s", field, message));
    }
}
