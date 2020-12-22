package by.epam.training.javaWEB.task02.entity.enums;

import by.epam.training.javaWEB.task02.entity.Laptop;

public enum ApplianceTypes {
    LAPTOP("Laptop", LaptopParams.values()),
    OVEN("Oven", OvenParams.values()),
    REFRIGERATOR("Refrigerator",RefrigeratorParams.values()),
    SPEAKERS("Speakers",SpeakersParams.values()),
    TABLET_PC("TabletPC",TabletPCParams.values()),
    VACUUM_CLEANER("VacuumCleaner",VacuumCleanerParams.values());

    String name;
    Enum[] params;

    ApplianceTypes(String name, Enum[] params) {
        this.name = name;
        this.params = params;
    }

    public String getName() {
        return name;
    }

    public Enum[] getParams() {
        return params;
    }
}
