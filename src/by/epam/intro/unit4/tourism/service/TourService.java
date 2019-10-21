package by.epam.intro.unit4.tourism.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epam.intro.unit4.tourism.bean.Tour;
/*
Туристические путевки.
Сформировать набор предложений клиенту по выбору туристической путевки различного типа
(отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
Учитывать возможность выбора транспорта, питания и числа дней.
Реализовать выбор и сортировку путевок.
 */
public class TourService  {
	
	
	
//вычисляет стоимость тура взависимости от значения параметров
	
	public double calculateTourPrice(Tour tour) {
		
		 double price=10;
		
		switch (tour.getType()) {
		case SEA:
			price *= 1.5 * tour.getDay();
			break;
		case EKS:
			price *= 1.3 * tour.getDay();
			break;
		case SHOP:
			price *= 1.2 * tour.getDay();
			break;
		case CRUISE:
			price *= 2.3 * tour.getDay();
			break;
		case HEALTH:
			price *= 2.5 * tour.getDay();
			break;
		default:
			System.out.println("Type of tour isn't correct!");
			price = 0;
		}

		switch (tour.getTransport()) {
		case AIR:
			price += 300;
			break;
		case BUS:
			price += 125;
			break;
		case TRAIN:
			price += 200;
			break;
		default:
			System.out.println("Transport of tour isn't correct!");
			price = 0;
		}
		
		switch (tour.getFood()) {
		case RO:
			break;
		case BB:
			price += 15 * tour.getDay();
			break;
		case HB:
			price += 30 * tour.getDay();
			break;
		case FB:
			price += 45 * tour.getDay();
			break;
		case ALL:
			price += 45 * tour.getDay() + 100;
			break;
		default:
			System.out.println("Type of food is incorrect");
			price = 0;
		}
		
		return price;

	}
	
	
	
	

}
