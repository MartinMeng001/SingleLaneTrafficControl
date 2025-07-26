package com.traffic.control.common.enums;

/**
 * 系统状态枚举
 */
public enum SystemStatus {
    STARTING("STARTING", "启动中"),
    RUNNING("RUNNING", "运行中"),
    STOPPING("STOPPING", "停止中"),
    STOPPED("STOPPED", "已停止"),
    ERROR("ERROR", "错误"),
    MAINTENANCE("MAINTENANCE", "维护中");

    private final String code;
    private final String description;

    SystemStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
}
