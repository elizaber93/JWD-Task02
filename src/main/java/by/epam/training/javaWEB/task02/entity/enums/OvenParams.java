package by.epam.training.javaWEB.task02.entity.enums;

public enum OvenParams {
    POWER_CONSUMPTION("POWER_CONSUMPTION"),
    WEIGHT("WEIGHT"),
    CAPACITY("CAPACITY"),
    DEPTH("DEPTH"),
    HEIGHT("HEIGHT"),
    WIDTH("WIDTH");

    String name;

    OvenParams (String name) {
        this.name = name;
    }


}
