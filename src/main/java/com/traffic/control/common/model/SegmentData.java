package com.traffic.control.common.model;

/**
 * 路段数据
 */
public class SegmentData {
    private String segmentId;           // 路段ID
    private String name;                // 路段名称
    private Direction direction;        // 方向
    private int vehicleCount;           // 车辆数量
    private double trafficDensity;      // 交通密度
    private double averageSpeed;        // 平均速度
    private int queueLength;            // 排队长度
    private LocalDateTime lastUpdate;   // 最后更新时间

    public SegmentData() {
        this.lastUpdate = LocalDateTime.now();
    }

    public SegmentData(String segmentId, Direction direction) {
        this();
        this.segmentId = segmentId;
        this.direction = direction;
    }

    // Getters and Setters
    public String getSegmentId() { return segmentId; }
    public void setSegmentId(String segmentId) { this.segmentId = segmentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Direction getDirection() { return direction; }
    public void setDirection(Direction direction) { this.direction = direction; }

    public int getVehicleCount() { return vehicleCount; }
    public void setVehicleCount(int vehicleCount) { this.vehicleCount = vehicleCount; }

    public double getTrafficDensity() { return trafficDensity; }
    public void setTrafficDensity(double trafficDensity) { this.trafficDensity = trafficDensity; }

    public double getAverageSpeed() { return averageSpeed; }
    public void setAverageSpeed(double averageSpeed) { this.averageSpeed = averageSpeed; }

    public int getQueueLength() { return queueLength; }
    public void setQueueLength(int queueLength) { this.queueLength = queueLength; }

    public LocalDateTime getLastUpdate() { return lastUpdate; }
    public void setLastUpdate(LocalDateTime lastUpdate) { this.lastUpdate = lastUpdate; }

    public void updateTimestamp() {
        this.lastUpdate = LocalDateTime.now();
    }
}
