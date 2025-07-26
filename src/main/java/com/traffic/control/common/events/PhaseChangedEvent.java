package com.traffic.control.common.events;

/**
 * 相位切换事件
 */
public class PhaseChangedEvent extends BaseEvent {
    private String intersectionId;
    private Phase fromPhase;
    private Phase toPhase;
    private int duration;

    public PhaseChangedEvent(String intersectionId, Phase fromPhase, Phase toPhase, int duration) {
        super("IntersectionController");
        this.intersectionId = intersectionId;
        this.fromPhase = fromPhase;
        this.toPhase = toPhase;
        this.duration = duration;
    }

    // Getters and Setters
    public String getIntersectionId() { return intersectionId; }
    public void setIntersectionId(String intersectionId) { this.intersectionId = intersectionId; }

    public Phase getFromPhase() { return fromPhase; }
    public void setFromPhase(Phase fromPhase) { this.fromPhase = fromPhase; }

    public Phase getToPhase() { return toPhase; }
    public void setToPhase(Phase toPhase) { this.toPhase = toPhase; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
}
