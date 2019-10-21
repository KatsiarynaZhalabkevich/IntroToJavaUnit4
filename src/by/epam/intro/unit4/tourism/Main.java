package by.epam.intro.unit4.tourism;

import java.util.List;

import by.epam.intro.unit4.tourism.bean.Agency;
import by.epam.intro.unit4.tourism.bean.Client;
import by.epam.intro.unit4.tourism.bean.Tour;
import by.epam.intro.unit4.tourism.enums.Food;
import by.epam.intro.unit4.tourism.enums.Transport;
import by.epam.intro.unit4.tourism.enums.Type;
import by.epam.intro.unit4.tourism.service.AgencyService;
import by.epam.intro.unit4.tourism.service.TourService;

/*
Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок.
 */
public class Main {

	public static void main(String[] args) {
		//может быть для данной задачи достаточно 1 клиента, который пришел выбрать тур?
		
		Client c1 = new Client("Ivanov Ivan");
		Client c2 = new Client("Petrov Petr");
		Client c3 = new Client("Markov Mark");
		Client c4 = new Client("Sergeev Sergei");
		Client c5= new Client("Sashina Sasha");
		
		Agency agency = new Agency();
		AgencyService as = new AgencyService();
		
		agency.addClient(c1);
		agency.addClient(c2);
		agency.addClient(c3);
		agency.addClient(c4);
		agency.addClient(c5);
		
		Tour t1 = new Tour(); //параметры по умолчанию
		Tour t2 = new Tour(Type.EKS, Transport.AIR, Food.BB, 5);
		Tour t3 = new Tour(Type.SEA, Transport.BUS, Food.RO, 21);
		Tour t4 = new Tour(Type.CRUISE, Transport.AIR, Food.ALL, 11);
		Tour t5 = new Tour(Type.SHOP, Transport.BUS, Food.RO); //по умолчанию 3 дня
		Tour t6 = new Tour(Type.EKS, Transport.TRAIN, Food.BB, 5);
		Tour t7 = new Tour(Type.HEALTH, Transport.BUS, Food.HB, 14);
		Tour t8 = new Tour(Type.EKS, Transport.BUS, Food.BB, 8);
		
		agency.addTour(t1);
		agency.addTour(t2);
		agency.addTour(t3);
		agency.addTour(t4);
		agency.addTour(t5);
		agency.addTour(t6);
		agency.addTour(t7);
		agency.addTour(t8);
		
		System.out.println("Welcome to touristic agency! ");
		System.out.println("All tours:");
		allTourInfo(agency);
		
		System.out.println("Tours by type"+Type.SEA);
		tourInfo(as.tourByType(agency,Type.SEA));
		
		System.out.println("Tours by price");
		tourInfo(as.sortByPrice(agency));
		
		System.out.println("Tours by transport"+Transport.BUS);
		tourInfo(as.tourByTransport(agency,Transport.BUS));
		
		System.out.println("You can also create your own tour. Please select tour type, transport, food and number of days to stay ");
		
		//stub 
		Type type = Type.SEA; // sea, eks, shop, cruise, health
		Transport transport = Transport.AIR; // air, bus, train, ship
		Food food = Food.ALL; // RO, HB, FB, ALL
		int day = 7; // min
		
		System.out.println("Creating tour by client's parametres...");
		Tour clientTour = new Tour(type, transport, food, day);
		
		c1.addTour(clientTour);
		
		System.out.println("Information about client and client's tours: ");
		clientInfo(c1);
			

	}
	
	public static void allTourInfo(Agency a) {
		TourService ts = new TourService();
		
		for (Tour t: a.getTourList()) {
			System.out.println(". Type "+t.getType()+", Transport "+t.getTransport()+", Food "+t.getFood()+", number of days "
					+t.getDay()+", price "+ts.calculateTourPrice(t));
			System.out.println();
		}
	}
	public static void tourInfo(List<Tour> tours) {
		TourService ts = new TourService();
		
		for (Tour t:tours) {
			System.out.println(". Type "+t.getType()+", Transport "+t.getTransport()+", Food "+t.getFood()+", number of days "
					+t.getDay()+", price "+ts.calculateTourPrice(t));
			System.out.println();
		}
	}
	public static void clientInfo(Client client) {
		TourService ts = new TourService();
		System.out.println(client.getName());
		for (Tour t:client.getTours()) {
			System.out.println(". Type "+t.getType()+", Transport "+t.getTransport()+", Food "+t.getFood()+", number of days "
					+t.getDay()+", price "+ts.calculateTourPrice(t));
			System.out.println();
		}
	}
	

}
