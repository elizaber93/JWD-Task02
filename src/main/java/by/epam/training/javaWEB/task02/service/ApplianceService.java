package by.epam.training.javaWEB.task02.service;

import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.entity.criteria.Criteria;

import java.io.IOException;

public interface ApplianceService {	
	
	Appliance find(Criteria criteria) throws IOException;
	
}
