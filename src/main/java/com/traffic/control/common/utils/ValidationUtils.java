package com.traffic.control.common.utils;

/**
 * 验证工具类
 */
public class ValidationUtils {

    /**
     * 验证车牌号格式（简单验证）
     */
    public static boolean isValidLicensePlate(String licensePlate) {
        if (isBlank(licensePlate)) return false;
        // 简单的车牌号验证，实际项目中应该更严格
        return licensePlate.length() >= 6 && licensePlate.length() <= 8;
    }

    /**
     * 验证路段ID格式
     */
    public static boolean isValidSegmentId(String segmentId) {
        if (isBlank(segmentId)) return false;
        // 路段ID应该以SL开头
        return segmentId.matches("^SL\\d+$");
    }

    /**
     * 验证路口ID格式
     */
    public static boolean isValidIntersectionId(String intersectionId) {
        if (isBlank(intersectionId)) return false;
        // 路口ID应该以INT_开头
        return intersectionId.matches("^INT_\\d+$");
    }

    /**
     * 验证传感器ID格式
     */
    public static boolean isValidSensorId(String sensorId) {
        if (isBlank(sensorId)) return false;
        // 传感器ID应该以SENSOR_开头
        return sensorId.matches("^SENSOR_\\d+$");
    }

    /**
     * 验证IP地址格式
     */
    public static boolean isValidIpAddress(String ip) {
        if (isBlank(ip)) return false;
        String ipPattern = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return ip.matches(ipPattern);
    }

    /**
     * 验证交通密度值
     */
    public static boolean isValidTrafficDensity(double density) {
        return density >= 0.0 && density <= 1.0;
    }

    /**
     * 验证相位持续时间
     */
    public static boolean isValidPhaseDuration(int duration) {
        return duration > 0 && duration <= 300; // 最大5分钟
    }

    private static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }
}
