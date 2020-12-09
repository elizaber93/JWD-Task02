package by.epam.training.javaWEB.task02.dto;

import java.util.Scanner;

public class Speakers extends Appliance implements IAppliance{
    private int powerConsumption;
    private int numberOfSpeakers;
    private double frequencyMIN;
    private double frequencyMAX;
    private int cordLength;

    public Speakers(int powerConsumption, int numberOfSpeakers, double frequencyMIN, double frequencyMAX, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyMIN = frequencyMIN;
        this.frequencyMAX = frequencyMAX;
        this.cordLength = cordLength;
    }

    public Speakers() {
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getFrequencyMIN() {
        return frequencyMIN;
    }

    public void setFrequencyMIN(double frequencyMIN) {
        this.frequencyMIN = frequencyMIN;
    }

    public double getFrequencyMAX() {
        return frequencyMAX;
    }

    public void setFrequencyMAX(double frequencyMAX) {
        this.frequencyMAX = frequencyMAX;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyMIN=" + frequencyMIN +
                ", frequencyMAX=" + frequencyMAX +
                ", cordLength=" + cordLength +
                '}';
    }

    @Override
    public void setParameters() {
        Scanner scan = new Scanner(System.in);
        System.out.println("powerConsumption:");
        setPowerConsumption(scan.nextInt());
        System.out.println("numberOfSpeakers:");
        setNumberOfSpeakers(scan.nextInt());
        System.out.println("frequencyMIN:");
        setFrequencyMIN(scan.nextDouble());
        System.out.println("frequencyMAX:");
        setFrequencyMAX(scan.nextDouble());
        System.out.println("cordLength:");
        setCordLength(scan.nextInt());

    }
}
