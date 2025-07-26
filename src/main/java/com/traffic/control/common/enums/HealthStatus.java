package com.traffic.control.common.enums;

/**
 * 健康状态枚举
 */
public enum HealthStatus {
    HEALTHY("HEALTHY", "健康", 1.0),
    WARNING("WARNING", "警告", 0.7),
    CRITICAL("CRITICAL", "严重", 0.3),
    DOWN("DOWN", "故障", 0.0);

    private final String code;
    private final String description;
    private final double score;

    HealthStatus(String code, String description, double score) {
        this.code = code;
        this.description = description;
        this.score = score;
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
    public double getScore() { return score; }
}
