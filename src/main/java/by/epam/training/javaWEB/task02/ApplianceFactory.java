package by.epam.training.javaWEB.task02;

import by.epam.training.javaWEB.task02.dto.*;

public class ApplianceFactory {
    public IAppliance getAppliance(ApplianceTypes type) {
        IAppliance resultAppliance = null;
        switch (type) {
            case OVEN:
                resultAppliance = new Refrigerator();
                break;
            case LAPTOP:
                resultAppliance = new Laptop();
                break;
            case REFRIGERATOR:
                resultAppliance = new Refrigerator();
                break;
            case VACUUM_CLEANER:
                resultAppliance = new VacuumCleaner();
                break;
            case TABLET_PC:
                resultAppliance = new TabletPC();
                break;
            case SPEAKERS:
                resultAppliance = new Speakers();
                break;
            default:
                throw new IllegalArgumentException("Wrong appliance type");
        }
        resultAppliance.setParameters();
        return resultAppliance;
    }
}
