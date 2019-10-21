package by.epam.intro.unit4.country.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные
 * центры.
 */

import by.epam.intro.unit4.country.bean.City;
import by.epam.intro.unit4.country.bean.District;
import by.epam.intro.unit4.country.bean.Region;
import by.epam.intro.unit4.country.bean.State;

public class StateLogic {

	

	public double countSquare(Set<Region> regions) {
		double square = 0;
		for (Region r : regions) {
			square += r.getSquare();
		}

		return square;
	}

	public City getCapital(State state) {

		for (Region r : state.getRegions()) {
			for (District d : r.getDistricts()) {
				for (City c : d.getCities()) {
					if (c.isCapital())
						return c;
				}
			}
		}

		return null;

	}

	public int getNumberOfRegions() {
		return Region.idGenerator;
	}

	public List<City> getRegionCenter(State state) {

		List<City> regionCenterLst = new ArrayList<>();
		
		for (Region r : state.getRegions()) {
			for (District d : r.getDistricts()) {
				for (City c : d.getCities()) {
					if (c.isDistrCenter()) {
					regionCenterLst.add(c);
					}
				}
			}
		}
		return regionCenterLst;
	}
}
