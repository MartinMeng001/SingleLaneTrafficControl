package com.traffic.control.common.exception;

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
