package com.traffic.control.common.events;

/**
 * 系统状态变更事件
 */
public class SystemStatusChangedEvent extends BaseEvent {
    private SystemStatus fromStatus;
    private SystemStatus toStatus;
    private String reason;

    public SystemStatusChangedEvent(SystemStatus fromStatus, SystemStatus toStatus, String reason) {
        super("SystemManager");
        this.fromStatus = fromStatus;
        this.toStatus = toStatus;
        this.reason = reason;
    }

    // Getters and Setters
    public SystemStatus getFromStatus() { return fromStatus; }
    public void setFromStatus(SystemStatus fromStatus) { this.fromStatus = fromStatus; }

    public SystemStatus getToStatus() { return toStatus; }
    public void setToStatus(SystemStatus toStatus) { this.toStatus = toStatus; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}
