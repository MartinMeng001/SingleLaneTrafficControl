package com.traffic.control.common.model;

import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public class DataStatistics {
    private long totalVehicleMessages;
    private long totalHeartbeatMessages;
    private long invalidMessages;
    private ConcurrentMap<Integer, AtomicLong> laneStatistics;
    private ConcurrentMap<String, AtomicLong> signalStatistics;
    private LocalDateTime startTime;
    private LocalDateTime currentTime;

    // Builder pattern
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private DataStatistics statistics = new DataStatistics();

        public Builder totalVehicleMessages(long count) {
            statistics.totalVehicleMessages = count;
            return this;
        }

        public Builder totalHeartbeatMessages(long count) {
            statistics.totalHeartbeatMessages = count;
            return this;
        }

        public Builder invalidMessages(long count) {
            statistics.invalidMessages = count;
            return this;
        }

        public Builder laneStatistics(ConcurrentMap<Integer, AtomicLong> stats) {
            statistics.laneStatistics = stats;
            return this;
        }

        public Builder signalStatistics(ConcurrentMap<String, AtomicLong> stats) {
            statistics.signalStatistics = stats;
            return this;
        }

        public Builder startTime(LocalDateTime time) {
            statistics.startTime = time;
            return this;
        }

        public Builder currentTime(LocalDateTime time) {
            statistics.currentTime = time;
            return this;
        }

        public DataStatistics build() {
            return statistics;
        }
    }

    // Getters
    public long getTotalVehicleMessages() { return totalVehicleMessages; }
    public long getTotalHeartbeatMessages() { return totalHeartbeatMessages; }
    public long getInvalidMessages() { return invalidMessages; }
    public ConcurrentMap<Integer, AtomicLong> getLaneStatistics() { return laneStatistics; }
    public ConcurrentMap<String, AtomicLong> getSignalStatistics() { return signalStatistics; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getCurrentTime() { return currentTime; }
}
