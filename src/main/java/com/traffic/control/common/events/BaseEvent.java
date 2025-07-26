package com.traffic.control.common.events;

import com.traffic.control.common.model.VehicleEvent;
import com.traffic.control.common.enums.Phase;
import java.time.LocalDateTime;

/**
 * 基础事件类
 */
public abstract class BaseEvent {
    private String eventId;
    private LocalDateTime timestamp;
    private String source;

    public BaseEvent() {
        this.eventId = generateEventId();
        this.timestamp = LocalDateTime.now();
    }

    public BaseEvent(String source) {
        this();
        this.source = source;
    }

    private String generateEventId() {
        return "EVENT_" + System.currentTimeMillis() + "_" + (int)(Math.random() * 1000);
    }

    // Getters and Setters
    public String getEventId() { return eventId; }
    public void setEventId(String eventId) { this.eventId = eventId; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
}
