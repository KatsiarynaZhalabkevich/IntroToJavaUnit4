package by.epam.intro.unit4.tourism.bean;

import java.util.Objects;

/*
 * Туристические путевки.
 * Сформировать набор предложений клиенту по выбору туристической путевки различного типа
 * (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * Учитывать возможность выбора транспорта, питания и числа дней.
 * Реализовать выбор и сортировку путевок.
 */
import by.epam.intro.unit4.tourism.enums.Food;
import by.epam.intro.unit4.tourism.enums.Transport;
import by.epam.intro.unit4.tourism.enums.Type;

/*
Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок.
 */
public class Tour {

	{
		++idGenerator;
	}
	private static int idGenerator = 0;
	private int id = idGenerator;
	private Type type; // sea, eks, shop, cruise, health
	private Transport transport; // air, bus, train, ship
	private Food food; // RO, HB, FB, ALL
	private int day = 3; // min


	public Tour() {
		type = Type.SEA;
		transport = Transport.AIR;
		food = Food.ALL;
	}

	public Tour(Type type, Transport transport, Food food, int day) {
		this.type = type;
		this.transport = transport;
		this.food = food;
		this.day = day;
	}

	public Tour(Type type, Transport transport, Food food) {
		this.type = type;
		this.transport = transport;
		this.food = food;
	}
	
	
	public int getId() {
		return id;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Type getType() {
		return type;
	}

	public Transport getTransport() {
		return transport;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Tour))
			return false;
		Tour tour = (Tour) o;
		return day == tour.day && // метод переопределять для enum не надо
				type.equals(tour.type) && transport.equals(tour.transport) && food.equals(tour.food);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type, transport, food, day);
	}

	@Override
	public String toString() {
		return "\nTour" +"id "+id+ ", type " + type + ", transport " + transport + ", food " + food + ", days number " + day;
	}

	
}
