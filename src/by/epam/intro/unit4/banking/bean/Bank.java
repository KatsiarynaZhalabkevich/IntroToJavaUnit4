package by.epam.intro.unit4.banking.bean;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	List <Client> clientList = new ArrayList<>();
	
	

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}
	
	public void addClient (Client client) {
		clientList.add(client);
	}
	
	public Client getClientByName (String name) {
		
		for (Client c : clientList) {
			if (c.getFirstName().equals(name)||c.getSecondName().equals(name))
				return c;
		}
		return null;
	}

	@Override
	public String toString() {
		return "Bank [clientList=" + clientList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientList == null) ? 0 : clientList.hashCode());
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
		Bank other = (Bank) obj;
		if (clientList == null) {
			if (other.clientList != null)
				return false;
		} else if (!clientList.equals(other.clientList))
			return false;
		return true;
	}

	
	
	
	

}
