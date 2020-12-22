package by.epam.training.javaWEB.task02.entity;

import by.epam.training.javaWEB.task02.entity.enums.OvenParams;
import by.epam.training.javaWEB.task02.entity.enums.VacuumCleanerParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class VacuumCleaner extends Appliance implements IAppliance, Serializable {
    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;


    public VacuumCleaner() {
    }

    public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(Map<Enum, String> param) {
        for (VacuumCleanerParams value : VacuumCleanerParams.values()) {
            if (!param.containsKey(value)) {
                throw new IllegalArgumentException("Illegal number of arguments");
            }
        }
        this.powerConsumption = Integer.parseInt(param.get(VacuumCleanerParams.POWER_CONSUMPTION));
        this.bagType = param.get(VacuumCleanerParams.BAG_TYPE);
        this.cleaningWidth = Integer.parseInt(param.get(VacuumCleanerParams.CLEANING_WIDTH));
        this.filterType = param.get(VacuumCleanerParams.FILTER_TYPE);
        this.motorSpeedRegulation = Integer.parseInt(param.get(VacuumCleanerParams.MOTOR_SPEED_REGULATION));
        this.wandType = param.get(VacuumCleanerParams.WAND_TYPE);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return powerConsumption == that.powerConsumption &&
                motorSpeedRegulation == that.motorSpeedRegulation &&
                cleaningWidth == that.cleaningWidth &&
                filterType.equals(that.filterType) &&
                bagType.equals(that.bagType) &&
                wandType.equals(that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(VacuumCleanerParams.BAG_TYPE.name(), (Object) this.bagType);
        parameters.put(VacuumCleanerParams.CLEANING_WIDTH.name(), (Object) this.cleaningWidth);
        parameters.put(VacuumCleanerParams.FILTER_TYPE.name(), (Object) this.filterType);
        parameters.put(VacuumCleanerParams.MOTOR_SPEED_REGULATION.name(), (Object) this.motorSpeedRegulation);
        parameters.put(VacuumCleanerParams.POWER_CONSUMPTION.name(), (Object) this.powerConsumption);
        parameters.put(VacuumCleanerParams.WAND_TYPE.name(), (Object) this.wandType);
        return parameters;
    }
}
