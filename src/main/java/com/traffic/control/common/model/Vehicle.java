package com.traffic.control.common.model;

import com.traffic.control.common.enums.*;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 车辆实体
 */
public class Vehicle {
    private String licensePlate;        // 车牌号
    private String vehicleType;         // 车辆类型
    private VehicleStatus status;       // 车辆状态
    private String currentSegmentId;    // 当前所在路段
    private Direction direction;        // 行驶方向
    private LocalDateTime enterTime;    // 进入时间
    private LocalDateTime exitTime;     // 离开时间
    private String sourceIp;           // 数据来源IP

    public Vehicle() {}

    public Vehicle(String licensePlate, String currentSegmentId, Direction direction) {
        this.licensePlate = licensePlate;
        this.currentSegmentId = currentSegmentId;
        this.direction = direction;
        this.status = VehicleStatus.ACTIVE;
        this.enterTime = LocalDateTime.now();
    }

    // Getters and Setters
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public VehicleStatus getStatus() { return status; }
    public void setStatus(VehicleStatus status) { this.status = status; }

    public String getCurrentSegmentId() { return currentSegmentId; }
    public void setCurrentSegmentId(String currentSegmentId) { this.currentSegmentId = currentSegmentId; }

    public Direction getDirection() { return direction; }
    public void setDirection(Direction direction) { this.direction = direction; }

    public LocalDateTime getEnterTime() { return enterTime; }
    public void setEnterTime(LocalDateTime enterTime) { this.enterTime = enterTime; }

    public LocalDateTime getExitTime() { return exitTime; }
    public void setExitTime(LocalDateTime exitTime) { this.exitTime = exitTime; }

    public String getSourceIp() { return sourceIp; }
    public void setSourceIp(String sourceIp) { this.sourceIp = sourceIp; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(licensePlate, vehicle.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }

    @Override
    public String toString() {
        return String.format("Vehicle{plate='%s', segment='%s', direction=%s, status=%s}",
                licensePlate, currentSegmentId, direction, status);
    }
}
