package com.traffic.control.dataaccess.monitor;

import com.traffic.control.common.events.HeartbeatEvent;
import com.traffic.control.common.events.VehicleDataEvent;
import com.traffic.control.common.model.*;
import com.traffic.control.common.events.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.time.LocalDateTime;

@Component
public class DataStatisticsService {
    private static final Logger log = LoggerFactory.getLogger(DataStatisticsService.class);

    // 统计计数器
    private final AtomicLong totalVehicleMessages = new AtomicLong(0);
    private final AtomicLong totalHeartbeatMessages = new AtomicLong(0);
    private final AtomicLong invalidMessages = new AtomicLong(0);

    // 按车道统计
    private final ConcurrentMap<Integer, AtomicLong> laneStatistics = new ConcurrentHashMap<>();

    // 按信号机统计
    private final ConcurrentMap<String, AtomicLong> signalStatistics = new ConcurrentHashMap<>();

    private LocalDateTime startTime = LocalDateTime.now();

    @EventListener
    public void handleVehicleDataEvent(VehicleDataEvent event) {
        VehicleData data = event.getVehicleData();

        // 更新总计数
        totalVehicleMessages.incrementAndGet();

        // 更新车道统计
        laneStatistics.computeIfAbsent(data.getLaneNumber(), k -> new AtomicLong(0))
                .incrementAndGet();

        // 更新信号机统计
        String signalIp = data.getSignalIp().getHostAddress();
        signalStatistics.computeIfAbsent(signalIp, k -> new AtomicLong(0))
                .incrementAndGet();
    }

    @EventListener
    public void handleHeartbeatEvent(HeartbeatEvent event) {
        totalHeartbeatMessages.incrementAndGet();
    }

    public void incrementInvalidMessages() {
        invalidMessages.incrementAndGet();
    }

    // 获取统计信息
    public DataStatistics getStatistics() {
        return DataStatistics.builder()
                .totalVehicleMessages(totalVehicleMessages.get())
                .totalHeartbeatMessages(totalHeartbeatMessages.get())
                .invalidMessages(invalidMessages.get())
                .laneStatistics(new ConcurrentHashMap<>(laneStatistics))
                .signalStatistics(new ConcurrentHashMap<>(signalStatistics))
                .startTime(startTime)
                .currentTime(LocalDateTime.now())
                .build();
    }

    public void resetStatistics() {
        totalVehicleMessages.set(0);
        totalHeartbeatMessages.set(0);
        invalidMessages.set(0);
        laneStatistics.clear();
        signalStatistics.clear();
        startTime = LocalDateTime.now();
        log.info("统计数据已重置");
    }
}
