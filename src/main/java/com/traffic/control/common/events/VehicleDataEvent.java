package com.traffic.control.common.events;

import com.traffic.control.common.model.VehicleData;
import org.springframework.context.ApplicationEvent;

public class VehicleDataEvent extends ApplicationEvent {
    private final VehicleData vehicleData;

    public VehicleDataEvent(Object source, VehicleData vehicleData) {
        super(source);
        this.vehicleData = vehicleData;
    }

    public VehicleData getVehicleData() {
        return vehicleData;
    }
}
