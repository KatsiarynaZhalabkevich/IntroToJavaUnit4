package by.epam.intro.unit4.country.bean;

import java.util.HashSet;
import java.util.Set;

public class Region {
	{
		++idGenerator;
	}
	public static int idGenerator = 0;// знать реальное количество областей
	private String name;
	private int id = idGenerator; // номер конкретной области
	private double square;

	Set<District> districts = new HashSet<>();

	public Region(String name, double square) {
		this.name = name;
		this.square = square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public double getSquare() {
		return square;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addDistrict(District district) {
		districts.add(district);
	}
	
	

	public Set<District> getDistricts() {
		return districts;
	}

	public void setDistricts(Set<District> districts) {
		this.districts = districts;
	}

	@Override
	public String toString() {
		return "Region " + name + ", square=" + square + ", districts:" + districts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

}
