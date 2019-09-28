package com.sg.SpringMVCDemo.FormTags;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private LinkedHashMap<String, String> countryOptions;
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		//create a student object
		Student student=new Student();
		
		//add the Student object to model
		model.addAttribute("student",student);
		
		//add the country options to the model 
	    model.addAttribute("theCountryOptions", countryOptions); 
		
		return "student-form";
	
	}
	
	@RequestMapping("/processForm")
	public String  processForm(@ModelAttribute("student") Student student) {
		
		//log the input data
		System.out.println("Student: "+student.getFirstName() + student.getLastName());
		
		return "student-confirmation";
	}

	
}
