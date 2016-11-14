package org.hello;

import java.util.ArrayList;
import java.util.List;




import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	
	@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Country> getCountries()
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();
		return listOfCountries;
	}
	@RequestMapping(value = "/countriesxml", method = RequestMethod.GET,headers="Accept=application/xml")
	public Country2 getCountriesxml()
	{
		Country2  t=new Country2(1, "gaurav");
		return t;
		
		//List<Country2> listOfCountries = new ArrayList<Country2>();
		//listOfCountries=createCountryListxml();
		//return listOfCountries;
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Country getCountryById(@PathVariable int id)
	{
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries=createCountryList();

		for (Country country: listOfCountries) {
			if(country.getId()==id)
				return country;
		}
		
		return null;
	}
	
	@RequestMapping(value = "/poly", method = RequestMethod.GET,headers="Accept=application/text")
	public String getIt(){
        return "Rahul Gandhi vaat Lage!";

    }

// Utiliy method to create country list.
	public List<Country> createCountryList()
	{
		Country indiaCountry=new Country(1, "India");
		Country chinaCountry=new Country(4, "China");
		Country nepalCountry=new Country(3, "Nepal");
		Country bhutanCountry=new Country(2, "Bhutan");

		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		return listOfCountries;
	}
	public List<Country2> createCountryListxml()
	{
		Country2 indiaCountry=new Country2(1, "India");
		Country2 chinaCountry=new Country2(4, "China");
		Country2 nepalCountry=new Country2(3, "Nepal");
		Country2 bhutanCountry=new Country2(2, "Pune");

		List<Country2> listOfCountries = new ArrayList<Country2>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		return listOfCountries;
	}
}
