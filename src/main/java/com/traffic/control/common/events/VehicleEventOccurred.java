package com.traffic.control.common.events;

/**
 * 车辆事件
 */
public class VehicleEventOccurred extends BaseEvent {
    private VehicleEvent vehicleEvent;

    public VehicleEventOccurred(VehicleEvent vehicleEvent) {
        super("VehicleTracker");
        this.vehicleEvent = vehicleEvent;
    }

    public VehicleEvent getVehicleEvent() { return vehicleEvent; }
    public void setVehicleEvent(VehicleEvent vehicleEvent) { this.vehicleEvent = vehicleEvent; }
}
