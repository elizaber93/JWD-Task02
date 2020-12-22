package by.epam.training.javaWEB.task02.entity;

import by.epam.training.javaWEB.task02.entity.enums.LaptopParams;
import by.epam.training.javaWEB.task02.entity.enums.OvenParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


public class Laptop extends Appliance implements IAppliance, Serializable {
    private double batteryCapacity;
    private String operatingSystem;
    private int memoryROM;
    private int systemMemory;
    private double cpu;
    private int displayInches;


    public Laptop() {
    }

    public Laptop(float batteryCapacity, String operatingSystem, int memoryROM, int systemMemory, float cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public Laptop(Map<Enum, String> param) {
        for (LaptopParams value : LaptopParams.values()) {
            if (!param.containsKey(value)) {
                throw new IllegalArgumentException("Illegal number of arguments");
            }
        }
        this.batteryCapacity = Double.parseDouble(param.get(LaptopParams.BATTERY_CAPACITY));
        this.cpu = Double.parseDouble(param.get(LaptopParams.CPU));
        this.displayInches = Integer.parseInt(param.get(LaptopParams.DISPLAY_INCHES));
        this.memoryROM = Integer.parseInt(param.get(LaptopParams.MEMORY_ROM));
        this.operatingSystem = param.get(LaptopParams.OS);
        this.systemMemory = Integer.parseInt(param.get(LaptopParams.SYSTEM_MEMORY));

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", memoryROM=" + memoryROM +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInches=" + displayInches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0 &&
                memoryROM == laptop.memoryROM &&
                systemMemory == laptop.systemMemory &&
                Double.compare(laptop.cpu, cpu) == 0 &&
                displayInches == laptop.displayInches &&
                operatingSystem.equals(laptop.operatingSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, operatingSystem, memoryROM, systemMemory, cpu, displayInches);
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(LaptopParams.SYSTEM_MEMORY.name(), (Object) this.systemMemory);
        parameters.put(LaptopParams.BATTERY_CAPACITY.name(), (Object) this.batteryCapacity);
        parameters.put(LaptopParams.MEMORY_ROM.name(), (Object) this.memoryROM);
        parameters.put(LaptopParams.CPU.name(), (Object) this.cpu);
        parameters.put(LaptopParams.DISPLAY_INCHES.name(), (Object) this.displayInches);
        parameters.put(LaptopParams.OS.name(), (Object) this.operatingSystem);
        return parameters;
    }
}

/*public class LaptopBuilder {

    private Laptop laptop = new Laptop();
    public Laptop build() {
        return laptop;
    }
    public LaptopBuilder setBatteryCapacity(double batteryCapacity) {
        laptop.setBatteryCapacity(batteryCapacity);
        return this;
    }

    public LaptopBuilder setOperatingSystem(String operatingSystem) {
        laptop.setOperatingSystem(operatingSystem);
        return this;
    }
    public LaptopBuilder setMemoryROM(int memoryROM) {
        laptop.setMemoryROM(memoryROM);
        return this;
    }
    public LaptopBuilder setSystemMemory(int systemMemory) {
        laptop.setSystemMemory(systemMemory);
        return this;
    }
    public LaptopBuilder setCPU(double cpu) {
        laptop.setCpu(cpu);
        return this;
    }
    public LaptopBuilder setDisplayInches(int displayInches) {
        laptop.setDisplayInches(displayInches);
        return  this;
    }
}

 */


