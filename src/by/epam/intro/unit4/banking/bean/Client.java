package by.epam.intro.unit4.banking.bean;

import java.util.ArrayList;
import java.util.List;

public class Client {
	{
		++idGenerator;
	}

	private static int idGenerator = 0;
	private int id = idGenerator;
	private String firstName;
	private String secondName;
	
	private List<Account> accounts = new ArrayList<>();

	public Client(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public Client(String firstName, String secondName, ArrayList<Account> accounts) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public Account getAccountByIndex(int index) {
		if (index >= 0 && index < accounts.size()) {
			return accounts.get(index);
		} else
			return null;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "Client id=" + id + ", firstName=" + firstName + ", secondName=" + secondName 
				+ ", accounts=" + accounts ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((secondName == null) ? 0 : secondName.hashCode());
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
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (secondName == null) {
			if (other.secondName != null)
				return false;
		} else if (!secondName.equals(other.secondName))
			return false;
		return true;
	}
	
	
	
	

}
