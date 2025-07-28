package com.traffic.control.web.controller.monitor;

import com.traffic.control.dataaccess.manager.ConnectionManager;
import com.traffic.control.dataaccess.tcp.TcpServer;
import com.traffic.control.dataaccess.monitor.DataStatisticsService;
import com.traffic.control.dataaccess.cache.VehicleDataCache;
import com.traffic.control.common.model.DataStatistics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/tcp")
@CrossOrigin(origins = "*")
public class TcpMonitorController {

    @Autowired
    private TcpServer tcpServer;

    @Autowired
    private ConnectionManager connectionManager;

    @Autowired
    private DataStatisticsService statisticsService;

    @Autowired
    private VehicleDataCache vehicleDataCache;

    // 获取TCP服务状态
    @GetMapping("/status")
    public ResponseEntity<Map<String, Object>> getTcpStatus() {
        Map<String, Object> status = new HashMap<>();
        status.put("running", tcpServer.isRunning());
        status.put("connectionCount", connectionManager.getConnectionCount());
        status.put("cacheSize", vehicleDataCache.size());
        return ResponseEntity.ok(status);
    }

    // 获取数据统计
    @GetMapping("/statistics")
    public ResponseEntity<DataStatistics> getStatistics() {
        return ResponseEntity.ok(statisticsService.getStatistics());
    }

    // 重置统计
    @PostMapping("/statistics/reset")
    public ResponseEntity<String> resetStatistics() {
        statisticsService.resetStatistics();
        return ResponseEntity.ok("统计数据已重置");
    }

    // 清空缓存
    @PostMapping("/cache/clear")
    public ResponseEntity<String> clearCache() {
        vehicleDataCache.clear();
        return ResponseEntity.ok("缓存已清空");
    }
}
