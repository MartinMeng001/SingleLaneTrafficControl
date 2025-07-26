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

/**
 * 配置异常
 */
public class ConfigurationException extends TrafficControlException {
    public ConfigurationException(String message) {
        super("CONFIG_ERROR", message);
    }

    public ConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
}

/**
 * 策略异常
 */
public class StrategyException extends TrafficControlException {
    public StrategyException(String message) {
        super("STRATEGY_ERROR", message);
    }

    public StrategyException(String message, Throwable cause) {
        super(message, cause);
    }
}

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
