package com.sg.SpringMVCDemo.FormTags;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	private String[] favouriteOperatingSystem;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		//populate countryOptions list . Used ISO country code
		
		/*setCountryOptions(new LinkedHashMap<String, String>());
		getCountryOptions().put("BR","Brazil");
		getCountryOptions().put("AR", "Argentina");
		getCountryOptions().put("IN", "India");
		getCountryOptions().put("FR", "France");
		getCountryOptions().put("GE", "Germany");*/
	
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}


	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}


	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}


	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}


	public String[] getFavouriteOperatingSystem() {
		return favouriteOperatingSystem;
	}


	public void setFavouriteOperatingSystem(String[] favouriteOperatingSystem) {
		this.favouriteOperatingSystem = favouriteOperatingSystem;
	}
}
