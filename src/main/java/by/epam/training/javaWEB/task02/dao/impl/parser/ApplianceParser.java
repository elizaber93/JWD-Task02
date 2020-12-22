package by.epam.training.javaWEB.task02.dao.impl.parser;

import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.entity.IAppliance;

import java.util.List;

public interface ApplianceParser {
    public List<Appliance> parse(List<String> applianceStringList);
}
