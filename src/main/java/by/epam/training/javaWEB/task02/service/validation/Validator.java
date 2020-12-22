package by.epam.training.javaWEB.task02.service.validation;

import by.epam.training.javaWEB.task02.entity.criteria.Criteria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		// you may add your own code here
		
		return true;
	}

	public static boolean TXTPathValidator(String path) {
		Pattern pattern = Pattern.compile("[A-Za-z0-9_]+(.txt)");
		Matcher matcher = pattern.matcher(path);
		return matcher.find();
	}

}



//you may add your own new classes