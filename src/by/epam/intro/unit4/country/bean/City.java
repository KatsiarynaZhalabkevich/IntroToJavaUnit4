package by.epam.intro.unit4.country.bean;

/**
 * Создать объект класса Государство, используя классы Область, Район, Город.
 * Методы: вывести на консоль столицу, количество областей, площадь, областные
 * центры.
 */
public class City {
	private String name;
	private boolean capital = false;
	private boolean distrCenter = false;

	public City(String name) {
		this.name = name;
	}

	public City(String name, boolean Capital, boolean DistrCenter) {
		this.name = name;
		this.capital = Capital;
		this.distrCenter = DistrCenter;
	}

	public City(String name, boolean DistrCenter) {
		this.name = name;
		this.distrCenter = DistrCenter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCapital() {
		return capital;
	}

	public boolean isDistrCenter() {
		return distrCenter;
	}

	@Override
	public String toString() {
		return "City " + name + "; ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (capital ? 1231 : 1237);
		result = prime * result + (distrCenter ? 1231 : 1237);
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
		City other = (City) obj;
		if (capital != other.capital)
			return false;
		if (distrCenter != other.distrCenter)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
