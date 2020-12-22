package by.epam.training.javaWEB.task02.entity.enums;

public enum RefrigeratorParams {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    WEIGHT("WEIGHT"),
    FREEZER_CAPACITY("FREEZER_CAPACITY"),
    OVERALL_CAPACITY("OVERALL_CAPACITY"),
    HEIGHT("HEIGHT"),
    WIDTH("WIDTH");

    String name;
    RefrigeratorParams (String name) {
        this.name = name;

    }
}
