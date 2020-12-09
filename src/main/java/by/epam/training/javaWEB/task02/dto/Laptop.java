package by.epam.training.javaWEB.task02.dto;

import java.util.Scanner;

public class Laptop extends Appliance implements IAppliance{
    private float batteryCapacity;
    private String operatingSystem;
    private int memoryROM;
    private int systemMemory;
    private float cpu;
    private int displayInches;

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
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

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public Laptop(float batteryCapacity, String operatingSystem, int memoryROM, int systemMemory, float cpu, int displayInches) {
        this.batteryCapacity = batteryCapacity;
        this.operatingSystem = operatingSystem;
        this.memoryROM = memoryROM;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
    }

    public Laptop() {
    }

    public void setParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("batteryCapacity:");
        setBatteryCapacity(scan.nextInt());
        System.out.println("operatingSystem:");
        setOperatingSystem(scan.nextLine());
        System.out.println("memoryROM:");
        setMemoryROM(scan.nextInt());
        System.out.println("systemMemory:");
        setSystemMemory(scan.nextInt());
        System.out.println("CPU:");
        setCpu(scan.nextInt());
        System.out.println("displayInches:");
        setDisplayInches(scan.nextInt());
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

}
