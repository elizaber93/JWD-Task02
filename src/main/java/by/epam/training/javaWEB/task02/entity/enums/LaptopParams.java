package by.epam.training.javaWEB.task02.entity.enums;

public enum LaptopParams {
    BATTERY_CAPACITY("BUTTERY_CAPACITY"),
    OS("OS"),
    MEMORY_ROM("MEMORY_ROM"),
    SYSTEM_MEMORY("SYSTEM_MEMORY"),
    CPU("CPU"),
    DISPLAY_INCHES("DISPLAY_INCHES");

    String name;

    LaptopParams (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
