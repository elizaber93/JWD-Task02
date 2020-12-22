package by.epam.training.javaWEB.task02;

import static by.epam.training.javaWEB.task02.entity.criteria.SearchCriteria.*;

import by.epam.training.javaWEB.task02.dao.ApplianceDAO;
import by.epam.training.javaWEB.task02.dao.DAOFactory;
import by.epam.training.javaWEB.task02.entity.Appliance;
import by.epam.training.javaWEB.task02.entity.criteria.Criteria;
import by.epam.training.javaWEB.task02.service.ApplianceService;
import by.epam.training.javaWEB.task02.service.ServiceFactory;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Appliance appliance;

		//ServiceFactory factory = ServiceFactory.getInstance();
		//ApplianceService service = factory.getApplianceService();

		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO service = factory.getApplianceDAO();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 32);

		appliance = service.find(criteriaOven);


		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 45);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);// find(Object...obj)

		PrintApplianceInfo.print(appliance);
	}

}
