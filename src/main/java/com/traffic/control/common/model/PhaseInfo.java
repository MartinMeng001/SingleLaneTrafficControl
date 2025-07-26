package com.traffic.control.common.model;

/**
 * 相位信息
 */
public class PhaseInfo {
    private Phase phase;                // 相位
    private int duration;               // 持续时间（秒）
    private int remainingTime;          // 剩余时间（秒）
    private LocalDateTime startTime;    // 开始时间
    private LocalDateTime endTime;      // 结束时间
    private String intersectionId;      // 路口ID

    public PhaseInfo() {}

    public PhaseInfo(Phase phase, int duration, String intersectionId) {
        this.phase = phase;
        this.duration = duration;
        this.remainingTime = duration;
        this.intersectionId = intersectionId;
        this.startTime = LocalDateTime.now();
        this.endTime = startTime.plusSeconds(duration);
    }

    // Getters and Setters
    public Phase getPhase() { return phase; }
    public void setPhase(Phase phase) { this.phase = phase; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public int getRemainingTime() { return remainingTime; }
    public void setRemainingTime(int remainingTime) { this.remainingTime = remainingTime; }

    public LocalDateTime getStartTime() { return startTime; }
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }

    public LocalDateTime getEndTime() { return endTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }

    public String getIntersectionId() { return intersectionId; }
    public void setIntersectionId(String intersectionId) { this.intersectionId = intersectionId; }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(endTime);
    }

    public void updateRemainingTime() {
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(endTime)) {
            this.remainingTime = (int) java.time.Duration.between(now, endTime).getSeconds();
        } else {
            this.remainingTime = 0;
        }
    }
}
