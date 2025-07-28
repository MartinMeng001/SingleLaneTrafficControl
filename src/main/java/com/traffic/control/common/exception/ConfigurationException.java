package com.traffic.control.common.exception;

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
