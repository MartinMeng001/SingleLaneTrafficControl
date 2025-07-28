package com.traffic.control.common.events;

import com.traffic.control.common.model.HeartbeatData;
import org.springframework.context.ApplicationEvent;

public class HeartbeatEvent extends ApplicationEvent {
    private final HeartbeatData heartbeatData;

    public HeartbeatEvent(Object source, HeartbeatData heartbeatData) {
        super(source);
        this.heartbeatData = heartbeatData;
    }

    public HeartbeatData getHeartbeatData() {
        return heartbeatData;
    }
}
