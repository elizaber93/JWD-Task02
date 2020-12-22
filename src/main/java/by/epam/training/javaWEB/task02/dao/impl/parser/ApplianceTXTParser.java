package by.epam.training.javaWEB.task02.dao.impl.parser;

import by.epam.training.javaWEB.task02.ApplianceFactory;
import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.entity.IAppliance;
import by.epam.training.javaWEB.task02.entity.enums.ApplianceTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceTXTParser implements ApplianceParser {
    @Override
    public List<Appliance> parse(List<String> applianceStringList) {
        List<Appliance> appliances = new ArrayList<>();
        ApplianceFactory applianceFactory = new ApplianceFactory();

        for (String s : applianceStringList) {
            for (ApplianceTypes value : ApplianceTypes.values()) {
                if (s.startsWith(value.getName())) {
                    appliances.add((Appliance)applianceFactory.getAppliance(value, parseApplianceParameters(value, s)));
                }
            }

        }
        return appliances;
    }

    public Map<Enum, String> parseApplianceParameters(ApplianceTypes type, String s) {
        Map <Enum, String> parameters= new HashMap<>();
        Pattern pattern = Pattern.compile("([A-Z_]+)=([A-Za-z0-9\\.\\-]+)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            for (Enum param : type.getParams()) {
                String group = matcher.group();
                if (matcher.group(1).equals(param.name())) {
                    parameters.put(param, matcher.group(2));
                }
            }
        }
        return parameters;

    }

}
