package com.traffic.control.common.constants;

/**
 * 消息常量
 */
public class MessageConstants {

    // 成功消息
    public static final String SUCCESS = "操作成功";
    public static final String STRATEGY_SWITCHED = "策略切换成功";
    public static final String PHASE_SWITCHED = "相位切换成功";
    public static final String CONFIG_UPDATED = "配置更新成功";

    // 错误消息
    public static final String SYSTEM_ERROR = "系统错误";
    public static final String INVALID_REQUEST = "无效的请求";
    public static final String RESOURCE_NOT_FOUND = "资源未找到";
    public static final String OPERATION_FAILED = "操作失败";

    // 警告消息
    public static final String HIGH_TRAFFIC_DENSITY = "交通密度过高";
    public static final String SYSTEM_OVERLOAD = "系统负载过高";
    public static final String COMMUNICATION_UNSTABLE = "通信不稳定";

    // 状态消息
    public static final String SYSTEM_STARTING = "系统启动中...";
    public static final String SYSTEM_READY = "系统就绪";
    public static final String EMERGENCY_MODE_ACTIVE = "紧急模式激活";
    public static final String MAINTENANCE_MODE_ACTIVE = "维护模式激活";
}
