package by.epam.training.javaWEB.task02.entity.enums;

public enum SpeakersParams {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    NUMBER_OF_SPEAKERS("NUMBER_OF_SPEAKERS"),
    FREQUENCY_RANGE("FREQUENCY_RANGE"),
    CORD_LENGTH("CORD_LENGTH");

    String name;

    SpeakersParams(String name) {
        this.name = name;
    }
}
