package by.epam.intro.unit4.country.bean;

import java.util.HashSet;
import java.util.Set;

import by.epam.intro.unit4.country.logic.StateLogic;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные
 * центры.
 */
public class State {

	private String name;
	private double square=0;
	Set<Region> regions = new HashSet<>();
	
	StateLogic stL = new StateLogic();

	public State(String name) {
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addRegion(Region region) {
		regions.add(region);
	}

	public Set<Region> getRegions() {
		return regions;
	}

	public void setRegions(Set<Region> regions) {
		this.regions = regions;
	}

	
	public double getSquare() {
		return stL.countSquare(regions);
	}

	//не нужен такой метод, но без него нарушение Java Beans
	public void setSquare(double square) {
		this.square = square;
	}

	@Override
	public String toString() {
		return "State " + name + ", square=" + getSquare() + ", regions:" + regions ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}
	
	
	

	

	

}
