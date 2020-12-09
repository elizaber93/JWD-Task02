package by.epam.training.javaWEB.task02.dto;

import java.util.Scanner;

public class Refrigerator extends Appliance implements IAppliance{
    private int powerConsumption;
    private int weight;
    private double freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator(int powerConsumption, int weight, double freezerCapacity, double overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("powerConsumption:");
        setPowerConsumption(scan.nextInt());
        System.out.println("weight:");
        setWeight(scan.nextInt());
        System.out.println("freezerCapacity:");
        setFreezerCapacity(scan.nextDouble());
        System.out.println("overallCapacity:");
        setOverallCapacity(scan.nextDouble());
        System.out.println("height");
        setHeight(scan.nextInt());
        System.out.println("width");
        setWidth(scan.nextInt());
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

}
