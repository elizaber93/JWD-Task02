package by.epam.training.javaWEB.task02.entity.enums;

public enum VacuumCleanerParams {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    FILTER_TYPE("FILTER_TYPE"),
    BAG_TYPE("BAG_TYPE"),
    WAND_TYPE("WAND_TYPE"),
    MOTOR_SPEED_REGULATION("MOTOR_SPEED_REGULATION"),
    CLEANING_WIDTH("CLEANING_WIDTH");

    String name;

    VacuumCleanerParams (String name) {
        this.name = name;
    }
}
