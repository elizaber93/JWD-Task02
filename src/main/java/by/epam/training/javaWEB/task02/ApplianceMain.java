package by.epam.training.javaWEB.task02;

import by.epam.training.javaWEB.task02.dto.ApplianceTypes;

public class ApplianceMain {
    public static void main(String[] args) {
        ApplianceFactory fact = new ApplianceFactory();
        fact.getAppliance(ApplianceTypes.REFRIGERATOR)
                                .seeParameters();
    }

}
