package com.traffic.control.common.events;

/**
 * 策略切换事件
 */
public class StrategyChangedEvent extends BaseEvent {
    private String fromStrategy;
    private String toStrategy;
    private String reason;
    private String segmentId;

    public StrategyChangedEvent(String fromStrategy, String toStrategy, String reason, String segmentId) {
        super("StrategyManager");
        this.fromStrategy = fromStrategy;
        this.toStrategy = toStrategy;
        this.reason = reason;
        this.segmentId = segmentId;
    }

    // Getters and Setters
    public String getFromStrategy() { return fromStrategy; }
    public void setFromStrategy(String fromStrategy) { this.fromStrategy = fromStrategy; }

    public String getToStrategy() { return toStrategy; }
    public void setToStrategy(String toStrategy) { this.toStrategy = toStrategy; }

    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }

    public String getSegmentId() { return segmentId; }
    public void setSegmentId(String segmentId) { this.segmentId = segmentId; }
}
