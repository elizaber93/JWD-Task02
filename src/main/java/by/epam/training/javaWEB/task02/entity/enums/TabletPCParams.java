package by.epam.training.javaWEB.task02.entity.enums;

public enum TabletPCParams {
    BATTERY_CAPACITY("BATTERY_CAPACITY"),
    DISPLAY_INCHES("DISPLAY_INCHES"),
    MEMORY_ROM("MEMORY_ROM"),
    FLASH_MEMORY_CAPACITY("FLASH_MEMORY_CAPACITY"),
    COLOR("COLOR");

    String name;

    TabletPCParams(String name) {
        this.name = name;
    }
}
