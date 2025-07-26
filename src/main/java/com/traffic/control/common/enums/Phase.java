package com.traffic.control.common.enums;

/**
 * 相位枚举
 */
public enum Phase {
    PHASE_1("PHASE_1", "上行绿灯，下行红灯", 1),
    PHASE_2("PHASE_2", "下行绿灯，上行红灯", 2),
    PHASE_3("PHASE_3", "全红状态", 3);

    private final String code;
    private final String description;
    private final int order;

    Phase(String code, String description, int order) {
        this.code = code;
        this.description = description;
        this.order = order;
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
    public int getOrder() { return order; }

    public static Phase fromCode(String code) {
        for (Phase phase : values()) {
            if (phase.code.equals(code)) {
                return phase;
            }
        }
        throw new IllegalArgumentException("Unknown phase code: " + code);
    }
}
