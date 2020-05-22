package kz.daurenad;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageofData implements Serializable {
    private String operationType;
    private Device device;
    private ArrayList<Device> devices;

    public PackageofData(String operationType, Device device) {
        this.operationType = operationType;
        this.device = device;
    }

    public PackageofData(String operationType) {
        this.operationType = operationType;
    }

    public PackageofData(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.device = device;
    }
}
