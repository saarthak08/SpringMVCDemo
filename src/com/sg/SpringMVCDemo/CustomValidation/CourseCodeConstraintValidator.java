package com.sg.SpringMVCDemo.CustomValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	private String coursePrefix;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result;
		if(value!=null)
		{
			result=value.startsWith(coursePrefix);
		}
		else { 
			return true;
		}
		return result;
	}
	
	
	@Override
	public void initialize(CourseCode coursecode) {
		coursePrefix=coursecode.value();
	}

}