package com.traffic.control.common.model;

/**
 * 交通状态
 */
public class TrafficState {
    private String segmentId;           // 路段ID
    private Direction direction;        // 方向
    private int totalVehicles;          // 总车辆数
    private int activeVehicles;         // 活跃车辆数
    private int waitingVehicles;        // 等待车辆数
    private double trafficDensity;      // 交通密度 (0.0-1.0)
    private double flowRate;            // 流量率 (车辆/分钟)
    private double averageWaitTime;     // 平均等待时间 (秒)
    private LocalDateTime analysisTime; // 分析时间

    public TrafficState() {
        this.analysisTime = LocalDateTime.now();
    }

    public TrafficState(String segmentId, Direction direction) {
        this();
        this.segmentId = segmentId;
        this.direction = direction;
    }

    // Getters and Setters
    public String getSegmentId() { return segmentId; }
    public void setSegmentId(String segmentId) { this.segmentId = segmentId; }

    public Direction getDirection() { return direction; }
    public void setDirection(Direction direction) { this.direction = direction; }

    public int getTotalVehicles() { return totalVehicles; }
    public void setTotalVehicles(int totalVehicles) { this.totalVehicles = totalVehicles; }

    public int getActiveVehicles() { return activeVehicles; }
    public void setActiveVehicles(int activeVehicles) { this.activeVehicles = activeVehicles; }

    public int getWaitingVehicles() { return waitingVehicles; }
    public void setWaitingVehicles(int waitingVehicles) { this.waitingVehicles = waitingVehicles; }

    public double getTrafficDensity() { return trafficDensity; }
    public void setTrafficDensity(double trafficDensity) { this.trafficDensity = trafficDensity; }

    public double getFlowRate() { return flowRate; }
    public void setFlowRate(double flowRate) { this.flowRate = flowRate; }

    public double getAverageWaitTime() { return averageWaitTime; }
    public void setAverageWaitTime(double averageWaitTime) { this.averageWaitTime = averageWaitTime; }

    public LocalDateTime getAnalysisTime() { return analysisTime; }
    public void setAnalysisTime(LocalDateTime analysisTime) { this.analysisTime = analysisTime; }

    /**
     * 判断交通状态等级
     */
    public TrafficLevel getTrafficLevel() {
        if (trafficDensity <= 0.3) return TrafficLevel.LOW;
        if (trafficDensity <= 0.7) return TrafficLevel.MEDIUM;
        if (trafficDensity <= 0.9) return TrafficLevel.HIGH;
        return TrafficLevel.CONGESTED;
    }

    public enum TrafficLevel {
        LOW, MEDIUM, HIGH, CONGESTED
    }
}
