package com.traffic.control.common.constants;

/**
 * 错误代码常量
 */
public class ErrorCodes {

    // 系统错误 (1000-1999)
    public static final String SYSTEM_ERROR = "1000";
    public static final String SYSTEM_STARTING = "1001";
    public static final String SYSTEM_STOPPING = "1002";
    public static final String SYSTEM_OVERLOAD = "1003";

    // 配置错误 (2000-2999)
    public static final String CONFIG_ERROR = "2000";
    public static final String CONFIG_NOT_FOUND = "2001";
    public static final String CONFIG_INVALID = "2002";
    public static final String CONFIG_LOAD_FAILED = "2003";

    // 通信错误 (3000-3999)
    public static final String COMM_ERROR = "3000";
    public static final String COMM_CONNECTION_FAILED = "3001";
    public static final String COMM_TIMEOUT = "3002";
    public static final String COMM_PROTOCOL_ERROR = "3003";

    // 数据错误 (4000-4999)
    public static final String DATA_ERROR = "4000";
    public static final String DATA_NOT_FOUND = "4001";
    public static final String DATA_INVALID = "4002";
    public static final String DATA_DUPLICATE = "4003";

    // 策略错误 (5000-5999)
    public static final String STRATEGY_ERROR = "5000";
    public static final String STRATEGY_NOT_FOUND = "5001";
    public static final String STRATEGY_SWITCH_FAILED = "5002";
    public static final String STRATEGY_EXECUTION_FAILED = "5003";

    // 控制错误 (6000-6999)
    public static final String CONTROL_ERROR = "6000";
    public static final String INTERSECTION_NOT_FOUND = "6001";
    public static final String PHASE_SWITCH_FAILED = "6002";
    public static final String EMERGENCY_MODE_FAILED = "6003";

    // 验证错误 (7000-7999)
    public static final String VALIDATION_ERROR = "7000";
    public static final String INVALID_LICENSE_PLATE = "7001";
    public static final String INVALID_SEGMENT_ID = "7002";
    public static final String INVALID_INTERSECTION_ID = "7003";
    public static final String INVALID_PHASE_DURATION = "7004";
}
