package by.epam.training.javaWEB.task02.entity;

import by.epam.training.javaWEB.task02.entity.enums.OvenParams;
import by.epam.training.javaWEB.task02.entity.enums.SpeakersParams;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Speakers extends Appliance implements IAppliance, Serializable {
    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public Speakers() {
    }

    public Speakers(int powerConsumption, int numberOfSpeakers, String frequencyRange, int cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers(Map<Enum, String> param) {
        for (SpeakersParams value : SpeakersParams.values()) {
            if (!param.containsKey(value)) {
                throw new IllegalArgumentException("Illegal number of arguments");
            }
        }
        this.powerConsumption = Integer.parseInt(param.get(SpeakersParams.POWER_CONSUMPTION));
        this.numberOfSpeakers = Integer.parseInt(param.get(SpeakersParams.NUMBER_OF_SPEAKERS));
        this.frequencyRange = param.get(SpeakersParams.FREQUENCY_RANGE);
        this.cordLength = Integer.parseInt(param.get(SpeakersParams.CORD_LENGTH));
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange=" + frequencyRange +
                ", cordLength=" + cordLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption &&
                numberOfSpeakers == speakers.numberOfSpeakers &&
                cordLength == speakers.cordLength &&
                frequencyRange.equals(speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
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

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public Map<String, Object> getParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put(SpeakersParams.CORD_LENGTH.name(), (Object) this.cordLength);
        parameters.put(SpeakersParams.FREQUENCY_RANGE.name(), (Object) this.frequencyRange);
        parameters.put(SpeakersParams.POWER_CONSUMPTION.name(), (Object) this.powerConsumption);
        parameters.put(SpeakersParams.NUMBER_OF_SPEAKERS.name(), (Object) this.numberOfSpeakers);
        return parameters;
    }
}
