package by.epam.training.javaWEB.task02.entity;

import by.epam.training.javaWEB.task02.entity.enums.OvenParams;
import by.epam.training.javaWEB.task02.entity.enums.RefrigeratorParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Refrigerator extends Appliance implements IAppliance, Serializable {
    private int powerConsumption;
    private int weight;
    private double freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public Refrigerator() {
    }

    public Refrigerator(int powerConsumption, int weight, double freezerCapacity, double overallCapacity, int height, int width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Refrigerator(Map<Enum, String> param) {
        for (RefrigeratorParams value : RefrigeratorParams.values()) {
            if (!param.containsKey(value)) {
                throw new IllegalArgumentException("Illegal number of arguments");
            }
        }
        this.freezerCapacity = Double.parseDouble(param.get(RefrigeratorParams.FREEZER_CAPACITY));
        this.powerConsumption = Integer.parseInt(param.get(RefrigeratorParams.POWER_CONSUMPTION));
        this.weight = Integer.parseInt(param.get(RefrigeratorParams.WEIGHT));
        this.overallCapacity = Double.parseDouble(param.get(RefrigeratorParams.OVERALL_CAPACITY));
        this.height = Integer.parseInt(param.get(RefrigeratorParams.HEIGHT));
        this.width = Integer.parseInt(param.get(RefrigeratorParams.WIDTH));
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Refrigerator)) return false;
        Refrigerator that = (Refrigerator) o;
        return powerConsumption == that.powerConsumption &&
                weight == that.weight &&
                Double.compare(that.freezerCapacity, freezerCapacity) == 0 &&
                Double.compare(that.overallCapacity, overallCapacity) == 0 &&
                height == that.height &&
                width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
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

    public Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(RefrigeratorParams.WEIGHT.name(), (Object) this.weight);
        parameters.put(RefrigeratorParams.OVERALL_CAPACITY.name(), (Object) this.overallCapacity);
        parameters.put(RefrigeratorParams.FREEZER_CAPACITY.name(), (Object) this.freezerCapacity);
        parameters.put(RefrigeratorParams.HEIGHT.name(), (Object) this.height);
        parameters.put(RefrigeratorParams.POWER_CONSUMPTION.name(), (Object) this.powerConsumption);
        parameters.put(RefrigeratorParams.WIDTH.name(), (Object) this.width);
        return parameters;
    }

}
