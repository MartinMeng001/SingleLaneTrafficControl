package com.traffic.control.common.model;

/**
 * 传感器消息
 */
public class SensorMessage {
    private String messageId;           // 消息ID
    private String licensePlate;        // 车牌号
    private String segmentId;           // 路段ID
    private Direction direction;        // 方向
    private EventType eventType;        // 事件类型
    private LocalDateTime timestamp;    // 时间戳
    private String sensorId;            // 传感器ID
    private String rawContent;          // 原始消息内容
    private String sourceIp;            // 来源IP

    public SensorMessage() {
        this.messageId = generateMessageId();
        this.timestamp = LocalDateTime.now();
    }

    private String generateMessageId() {
        return "MSG_" + System.currentTimeMillis() + "_" + (int)(Math.random() * 1000);
    }

    // Getters and Setters
    public String getMessageId() { return messageId; }
    public void setMessageId(String messageId) { this.messageId = messageId; }

    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public String getSegmentId() { return segmentId; }
    public void setSegmentId(String segmentId) { this.segmentId = segmentId; }

    public Direction getDirection() { return direction; }
    public void setDirection(Direction direction) { this.direction = direction; }

    public EventType getEventType() { return eventType; }
    public void setEventType(EventType eventType) { this.eventType = eventType; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public String getSensorId() { return sensorId; }
    public void setSensorId(String sensorId) { this.sensorId = sensorId; }

    public String getRawContent() { return rawContent; }
    public void setRawContent(String rawContent) { this.rawContent = rawContent; }

    public String getSourceIp() { return sourceIp; }
    public void setSourceIp(String sourceIp) { this.sourceIp = sourceIp; }
}
