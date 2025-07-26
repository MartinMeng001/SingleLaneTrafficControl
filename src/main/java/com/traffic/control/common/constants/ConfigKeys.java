package com.traffic.control.common.constants;

/**
 * 配置键常量
 */
public class ConfigKeys {

    // 服务器配置
    public static final String SERVER_TCP_PORT = "server.tcp.port";
    public static final String SERVER_WEB_PORT = "server.web.port";
    public static final String SERVER_WEBSOCKET_PORT = "server.websocket.port";

    // 数据库配置
    public static final String DB_URL = "database.url";
    public static final String DB_USERNAME = "database.username";
    public static final String DB_PASSWORD = "database.password";

    // 策略配置
    public static final String STRATEGY_DEFAULT = "strategy.default";
    public static final String STRATEGY_AUTO_SWITCH = "strategy.auto-switch.enabled";
    public static final String STRATEGY_SWITCH_INTERVAL = "strategy.switch.interval";

    // 相位配置
    public static final String PHASE_DEFAULT_DURATION = "phase.default.duration";
    public static final String PHASE_MIN_DURATION = "phase.min.duration";
    public static final String PHASE_MAX_DURATION = "phase.max.duration";
    public static final String PHASE_ALL_RED_DURATION = "phase.all-red.duration";

    // 监控配置
    public static final String MONITOR_ENABLED = "monitor.enabled";
    public static final String MONITOR_INTERVAL = "monitor.interval";
    public static final String MONITOR_ALERT_THRESHOLD = "monitor.alert.threshold";

    // 日志配置
    public static final String LOG_LEVEL = "log.level";
    public static final String LOG_FILE_PATH = "log.file.path";
    public static final String LOG_MAX_SIZE = "log.max.size";
}
