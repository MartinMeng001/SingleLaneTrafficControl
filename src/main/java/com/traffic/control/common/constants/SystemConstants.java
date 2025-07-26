package com.traffic.control.common.constants;

/**
 * 系统常量
 */
public class SystemConstants {

    // 系统信息
    public static final String SYSTEM_NAME = "智能交通控制系统";
    public static final String SYSTEM_VERSION = "1.0.0";
    public static final String SYSTEM_AUTHOR = "Traffic Control Team";

    // 默认配置
    public static final int DEFAULT_TCP_PORT = 8888;
    public static final int DEFAULT_WEB_PORT = 8080;
    public static final int DEFAULT_WEBSOCKET_PORT = 8081;

    // 时间相关
    public static final int DEFAULT_PHASE_DURATION = 30; // 默认相位持续时间（秒）
    public static final int MIN_PHASE_DURATION = 5;      // 最小相位持续时间（秒）
    public static final int MAX_PHASE_DURATION = 180;    // 最大相位持续时间（秒）
    public static final int ALL_RED_DURATION = 3;        // 全红清空时间（秒）

    // 交通流量相关
    public static final double LOW_DENSITY_THRESHOLD = 0.3;    // 低密度阈值
    public static final double HIGH_DENSITY_THRESHOLD = 0.7;   // 高密度阈值
    public static final double CONGESTION_THRESHOLD = 0.9;     // 拥堵阈值

    // 系统限制
    public static final int MAX_VEHICLES_PER_SEGMENT = 100;    // 每个路段最大车辆数
    public static final int MAX_SEGMENTS_PER_INTERSECTION = 8; // 每个路口最大连接路段数
    public static final int MAX_STRATEGY_SWITCH_PER_HOUR = 10; // 每小时最大策略切换次数

    // 数据保留时间
    public static final int VEHICLE_DATA_RETENTION_HOURS = 24;    // 车辆数据保留时间
    public static final int TRAFFIC_STATS_RETENTION_DAYS = 30;    // 交通统计保留时间
    public static final int SYSTEM_LOG_RETENTION_DAYS = 7;        // 系统日志保留时间

    // 性能相关
    public static final int THREAD_POOL_CORE_SIZE = 5;
    public static final int THREAD_POOL_MAX_SIZE = 20;
    public static final int THREAD_POOL_QUEUE_CAPACITY = 100;
    public static final int CONNECTION_TIMEOUT_SECONDS = 30;
    public static final int READ_TIMEOUT_SECONDS = 60;
}
