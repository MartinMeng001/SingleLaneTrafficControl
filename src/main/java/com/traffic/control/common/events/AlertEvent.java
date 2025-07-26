package com.traffic.control.common.events;

/**
 * 告警事件
 */
public class AlertEvent extends BaseEvent {
    private AlertLevel level;
    private String alertType;
    private String message;
    private String affectedResource;

    public AlertEvent(AlertLevel level, String alertType, String message) {
        super("AlertManager");
        this.level = level;
        this.alertType = alertType;
        this.message = message;
    }

    public AlertEvent(AlertLevel level, String alertType, String message, String affectedResource) {
        this(level, alertType, message);
        this.affectedResource = affectedResource;
    }

    // Getters and Setters
    public AlertLevel getLevel() { return level; }
    public void setLevel(AlertLevel level) { this.level = level; }

    public String getAlertType() { return alertType; }
    public void setAlertType(String alertType) { this.alertType = alertType; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getAffectedResource() { return affectedResource; }
    public void setAffectedResource(String affectedResource) { this.affectedResource = affectedResource; }

    public enum AlertLevel {
        INFO, WARNING, ERROR, CRITICAL
    }
}
