package com.traffic.control.common.enums;

/**
 * 信号灯状态枚举
 */
public enum LightState {
    RED("RED", "红灯", "#FF0000"),
    GREEN("GREEN", "绿灯", "#00FF00"),
    YELLOW("YELLOW", "黄灯", "#FFFF00"),
    FLASHING_RED("FLASHING_RED", "闪烁红灯", "#FF6666"),
    FLASHING_YELLOW("FLASHING_YELLOW", "闪烁黄灯", "#FFFF66"),
    OFF("OFF", "关闭", "#808080");

    private final String code;
    private final String description;
    private final String colorCode;

    LightState(String code, String description, String colorCode) {
        this.code = code;
        this.description = description;
        this.colorCode = colorCode;
    }

    public String getCode() { return code; }
    public String getDescription() { return description; }
    public String getColorCode() { return colorCode; }
}
