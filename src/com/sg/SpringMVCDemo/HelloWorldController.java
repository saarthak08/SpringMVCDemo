package com.sg.SpringMVCDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Controller
@RequestMapping("/helloWorld")
public class HelloWorldController {
	//need a controller method to show initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
	
		return "helloworld";
	}
	
	//new controller method to read form data
	//& add the data to the model
	@RequestMapping("/processFormInCapitalLetter")
	public String processFormInCapitalLetter(HttpServletRequest request, Model model){
		
		//read the request parameter from HTML form
		String theString=request.getParameter("studentName");
		
		//convert data to all caps
		if(theString!=null) {
		theString=theString.toUpperCase();

		//create the message
		String message="Yo! "+theString;
		
		//add message to the model
		model.addAttribute("message",message);
		}
		return "capital-form";
	}
	
	
	@RequestMapping("processFormWithRequestParam")
	public String processFormWithRequestParam(@RequestParam("studentName")String name, Model model) {
		if(name!=null) {
			name=name.toUpperCase();
			String messageString="Hello! "+name;
			model.addAttribute("message",messageString);
			
		}
		
		return "capital-form";
	}
}
