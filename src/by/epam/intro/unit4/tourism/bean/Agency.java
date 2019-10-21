package by.epam.intro.unit4.tourism.bean;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.intro.unit4.tourism.enums.Transport;
import by.epam.intro.unit4.tourism.enums.Type;
import by.epam.intro.unit4.tourism.service.TourService;

public class Agency {

	List<Tour> tourList = new ArrayList<>();
	List<Client> clientList = new ArrayList<>();

	

	public void addTour(Tour tour) {

		tourList.add(tour);
	}

	public void delTour(int index) {
		tourList.remove(index);
	}

	public List<Tour> getTourList() {
		return tourList;
	}

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	public void addClient(Client client) {
		clientList.add(client);
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientList == null) ? 0 : clientList.hashCode());
		result = prime * result + ((tourList == null) ? 0 : tourList.hashCode());
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
		Agency other = (Agency) obj;
		if (clientList == null) {
			if (other.clientList != null)
				return false;
		} else if (!clientList.equals(other.clientList))
			return false;
		if (tourList == null) {
			if (other.tourList != null)
				return false;
		} else if (!tourList.equals(other.tourList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agency [tourList=" + tourList + ", clientList=" + clientList + "]";
	}

}
