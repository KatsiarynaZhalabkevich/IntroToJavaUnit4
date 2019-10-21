package by.epam.intro.unit4.tourism.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.intro.unit4.tourism.bean.Agency;
import by.epam.intro.unit4.tourism.bean.Tour;
import by.epam.intro.unit4.tourism.enums.Transport;
import by.epam.intro.unit4.tourism.enums.Type;

public class AgencyService {
	
	TourService ts = new TourService();
	
	public List<Tour> sortByPrice(Agency a) {
		List<Tour> lst = new ArrayList<>(a.getTourList());

		lst.sort(new Comparator<Tour>() {
			@Override
			public int compare(Tour o1, Tour o2) {
				return (ts.calculateTourPrice(o1) >= ts.calculateTourPrice(o2) ? 1 : -1);
			}
		});

		return lst;
	}

	public List<Tour> tourByType(Agency a, Type type) {
		List<Tour> lst = new ArrayList<>();
		for (Tour t : a.getTourList()) {
			if (t.getType().equals(type)) {
				lst.add(t);
			}
		}
		return lst;
	}

	public List<Tour> tourByTransport(Agency a, Transport transport) {
		ArrayList<Tour> lst = new ArrayList<>();
		for (Tour t : a.getTourList()) {
			if (t.getTransport().equals(transport)) {
				lst.add(t);
			}
		}
		return lst;
	}
}
