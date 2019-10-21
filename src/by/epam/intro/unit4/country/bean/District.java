package by.epam.intro.unit4.country.bean;

import java.util.ArrayList;
import java.util.List;

public class District {
	private String name;
	List<City> cities = new ArrayList<>();

	public  District (String name) {
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCity(City city) {
		cities.add(city);
	}
	
	public City getCityByNumber(int number) {
		
		if(number>=0&&number<cities.size()) {
		return cities.get(number);}
		else return cities.get(0); //null лучше не возвращать? 
	}
	
	

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Region" + name + ", cities:" + cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		District other = (District) obj;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
