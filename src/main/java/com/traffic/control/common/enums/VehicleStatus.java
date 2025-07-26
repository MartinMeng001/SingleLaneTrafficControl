package com.traffic.control.common.enums;

/**
 * 车辆状态枚举
 */
public enum VehicleStatus {
    ACTIVE("ACTIVE", "活跃"),
    WAITING("WAITING", "等待"),
    MOVING("MOVING", "移动中"),
    STOPPED("STOPPED", "停止"),
    EXITED("EXITED", "已离开"),
    UNKNOWN("UNKNOWN", "未知");

    private final String code;
    private final String description;

    VehicleStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
}
