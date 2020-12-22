package by.epam.training.javaWEB.task02.entity;

import by.epam.training.javaWEB.task02.entity.enums.LaptopParams;
import by.epam.training.javaWEB.task02.entity.enums.OvenParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Oven extends Appliance implements IAppliance, Serializable {
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;


    public Oven() {

    }

    public Oven(int powerConsumption, int weight, int capacity, int depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven(Map<Enum, String> param) {
        for (OvenParams value : OvenParams.values()) {
            if (!param.containsKey(value)) {
                throw new IllegalArgumentException("Illegal number of arguments");
            }
            this.capacity = Integer.parseInt(param.get(OvenParams.CAPACITY));
            this.depth = Integer.parseInt(param.get(OvenParams.DEPTH));
            this.height = Double.parseDouble(param.get(OvenParams.HEIGHT));
            this.powerConsumption = Integer.parseInt(param.get(OvenParams.POWER_CONSUMPTION));
            this.weight = Integer.parseInt(param.get(OvenParams.WEIGHT));
            this.width = Double.parseDouble((param.get(OvenParams.WIDTH)));
        }
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerCompsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Oven)) return false;
        Oven oven = (Oven) o;
        return powerConsumption == oven.powerConsumption &&
                weight == oven.weight &&
                capacity == oven.capacity &&
                depth == oven.depth &&
                Double.compare(oven.height, height) == 0 &&
                Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerCompsumption) {
        this.powerConsumption = powerCompsumption;
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

    public Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(OvenParams.WEIGHT.name(), (Object) this.weight);
        parameters.put(OvenParams.CAPACITY.name(), (Object) this.capacity);
        parameters.put(OvenParams.DEPTH.name(), (Object) this.depth);
        parameters.put(OvenParams.HEIGHT.name(), (Object) this.height);
        parameters.put(OvenParams.POWER_CONSUMPTION.name(), (Object) this.powerConsumption);
        parameters.put(OvenParams.WIDTH.name(), (Object) this.width);
        return parameters;
    }
}
/*
public class OvenBuilder() {
    private Oven oven = new Oven();

    public Oven build() {
        return oven;
    }
    public OvenBuilder setPowerConsumption(int powerConsumption) {
        oven.setPowerConsumption(powerConsumption);
        return this;
    }

    public OvenBuilder setWeight(int weight) {
        oven.setWeight(weight);
        return this;
    }
    public OvenBuilder setCapacity(int capacity) {
        oven.setCapacity(capacity);
        return this;
    }
    public OvenBuilder setDepth(int depth) {
        oven.setDepth(depth);
        return this;
    }
    public OvenBuilder setHeight(double height) {
        oven.setHeight(height);
        return this;
    }
    public OvenBuilder setWidth(double width) {
        oven.setWidth(width);
        return this;
    }
}

 */