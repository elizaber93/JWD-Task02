package by.epam.training.javaWEB.task02.service.impl;

import by.epam.training.javaWEB.task02.dao.ApplianceDAO;
import by.epam.training.javaWEB.task02.dao.DAOFactory;
import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.entity.criteria.Criteria;
import by.epam.training.javaWEB.task02.service.ApplianceService;
import by.epam.training.javaWEB.task02.service.validation.Validator;

import java.io.IOException;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		Appliance appliance = applianceDAO.find(criteria);
		
		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
