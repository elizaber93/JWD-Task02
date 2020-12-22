package by.epam.training.javaWEB.task02;

import by.epam.training.javaWEB.task02.entity.*;
import by.epam.training.javaWEB.task02.entity.enums.ApplianceTypes;

import java.util.Map;

public class ApplianceFactory {
    public IAppliance getAppliance(ApplianceTypes type, Map<Enum, String> params) {
        IAppliance resultAppliance = null;
        switch (type) {
            case OVEN:
                resultAppliance = new Oven(params);
                break;
            case LAPTOP:
                resultAppliance = new Laptop(params);
                break;
            case REFRIGERATOR:
                resultAppliance = new Refrigerator(params);
                break;
            case VACUUM_CLEANER:
                resultAppliance = new VacuumCleaner(params);
                break;
            case TABLET_PC:
                resultAppliance = new TabletPC(params);
                break;
            case SPEAKERS:
                resultAppliance = new Speakers(params);
                break;
            default:
                throw new IllegalArgumentException("Wrong appliance type");
        }
        return resultAppliance;
    }
}
