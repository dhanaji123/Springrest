package org.hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "countriesxml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Country2 {
	@XmlElement
	int id;
	@XmlElement
	String countryName;

	public Country2() {

	}

	public Country2(int i, String countryName) {
		super();
		this.id = i;
		this.countryName = countryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}