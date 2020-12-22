package by.epam.training.javaWEB.task02.entity;

import by.epam.training.javaWEB.task02.entity.enums.OvenParams;
import by.epam.training.javaWEB.task02.entity.enums.TabletPCParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TabletPC extends Appliance implements IAppliance, Serializable {
    private int batteryCapacity;
    private int displayInches;
    private int memoryROM;
    private int flashMemoryCapacity;
    private String color;


    public TabletPC() {
    }

    public TabletPC(int batteryCapacity, int displayInches, int memoryROM, int flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryROM = memoryROM;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(Map<Enum, String> param) {
        for (TabletPCParams value : TabletPCParams.values()) {
            if (!param.containsKey(value)) {
                throw new IllegalArgumentException("Illegal number of arguments");
            }
        }
        this.batteryCapacity = Integer.parseInt(param.get(TabletPCParams.BATTERY_CAPACITY));
        this.color = param.get(TabletPCParams.COLOR);
        this.displayInches = Integer.parseInt(param.get(TabletPCParams.DISPLAY_INCHES));
        this.flashMemoryCapacity = Integer.parseInt(param.get(TabletPCParams.FLASH_MEMORY_CAPACITY));
        this.memoryROM = Integer.parseInt(param.get(TabletPCParams.MEMORY_ROM));
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryROM=" + memoryROM +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return batteryCapacity == tabletPC.batteryCapacity &&
                displayInches == tabletPC.displayInches &&
                memoryROM == tabletPC.memoryROM &&
                flashMemoryCapacity == tabletPC.flashMemoryCapacity &&
                color.equals(tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryROM, flashMemoryCapacity, color);
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryROM() {
        return memoryROM;
    }

    public void setMemoryROM(int memoryROM) {
        this.memoryROM = memoryROM;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(TabletPCParams.BATTERY_CAPACITY.name(), (Object) this.batteryCapacity);
        parameters.put(TabletPCParams.COLOR.name(), (Object) this.color);
        parameters.put(TabletPCParams.DISPLAY_INCHES.name(), (Object) this.displayInches);
        parameters.put(TabletPCParams.FLASH_MEMORY_CAPACITY.name(), (Object) this.flashMemoryCapacity);
        parameters.put(TabletPCParams.MEMORY_ROM.name(), (Object) this.memoryROM);
        return parameters;
    }
}
