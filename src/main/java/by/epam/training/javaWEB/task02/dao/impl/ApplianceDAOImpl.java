package by.epam.training.javaWEB.task02.dao.impl;

import by.epam.training.javaWEB.task02.dao.ApplianceDAO;
import by.epam.training.javaWEB.task02.dao.impl.parser.ApplianceParser;
import by.epam.training.javaWEB.task02.dao.impl.parser.ApplianceTXTParser;
import by.epam.training.javaWEB.task02.dao.impl.reader.ApplianceReader;
import by.epam.training.javaWEB.task02.dao.impl.reader.ApplianceTXTReader;
import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.entity.criteria.Criteria;
import by.epam.training.javaWEB.task02.entity.enums.ApplianceTypes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		// you may add your own code here
		ApplianceReader applianceReader = new ApplianceTXTReader();
		ApplianceParser applianceParser = new ApplianceTXTParser();
		List<Appliance> applianceList = applianceParser.parse(applianceReader.read("appliances_db.txt"));

		int tmp = 0;
		for (Appliance appliance : applianceList) {
			if (criteria.getGroupSearchName().equals(appliance.getClass().getSimpleName())) {
				for (String s : appliance.getParameters().keySet()) {
					if (appliance.getParameters().get(s).equals(criteria.getCriteria().get(s))) {
						tmp++;
					}
				}
				if (tmp == criteria.getCriteria().size()) return appliance;
			}
		}
		return null;
	}


	// you may add your own code here

}

//you may add your own new classes