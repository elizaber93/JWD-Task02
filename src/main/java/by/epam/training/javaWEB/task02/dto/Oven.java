package by.epam.training.javaWEB.task02.dto;

import java.util.Scanner;

public class Oven extends Appliance implements IAppliance{
    private int powerCompsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public int getPowerCompsumption() {
        return powerCompsumption;
    }

    public void setPowerCompsumption(int powerCompsumption) {
        this.powerCompsumption = powerCompsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Oven(int powerCompsumption, int weight, int capacity, int depth, double height, double width) {
        this.powerCompsumption = powerCompsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven() {

    }

    public void setParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("powerCompsumption:");
        setPowerCompsumption(scan.nextInt());
        System.out.println("weight:");
        setWeight(scan.nextInt());
        System.out.println("capacity:");
        setCapacity(scan.nextInt());
        System.out.println("depth:");
        setDepth(scan.nextInt());
        System.out.println("height:");
        setHeight(scan.nextDouble());
        System.out.println("width:");
        setWidth(scan.nextDouble());
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerCompsumption=" + powerCompsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
