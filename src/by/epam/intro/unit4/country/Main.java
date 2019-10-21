package by.epam.intro.unit4.country;

import by.epam.intro.unit4.country.bean.City;
import by.epam.intro.unit4.country.bean.District;
import by.epam.intro.unit4.country.bean.Region;
import by.epam.intro.unit4.country.bean.State;
import by.epam.intro.unit4.country.logic.StateLogic;

public class Main {

	public static void main(String[] args) {
		
		StateLogic stateLogic = new StateLogic();
		
		City c1 = new City("Minsk", true, true);
        City c2 = new City("Brest", false, true);
        City c3 = new City("Mogilev", true);
        City c4 = new City("Vitebsk", true);
        City c5 = new City("Grodno", true);
        City c6 = new City("Gomel", true);
        City c7 = new City("Baranovichi");
        
        District d1 = new District("Minski");
        District d2 = new District("Baranovicheski");
        District d3 = new District("Brestski");
        District d4 = new District("Mogilevski");   //районы 
        District d5 = new District("Vitebski");
        District d6 = new District("Grodnenski");
        District d7 = new District("Gomelski");
        

        d1.addCity(c1);
        d2.addCity(c7); 
        d3.addCity(c3);
        d4.addCity(c4);
        d5.addCity(c5);
        d6.addCity(c6);
        d7.addCity(c2);
        
        
        Region r1 = new Region("1", 124.986);
        Region r2 = new Region("2", 2.065);
        Region r3 = new Region("3", 12.56); //области названы в соответствии с автомобильными номерами
        Region r4 = new Region("4", 325.69);
        Region r6 = new Region("6", 169.256);
        Region r7 = new Region("7", 1278.15);
        
        
        r1.addDistrict(d3);
        r2.addDistrict(d5);
        r3.addDistrict(d2);
        r4.addDistrict(d6);
        r6.addDistrict(d7);
        r7.addDistrict(d1);
        r1.addDistrict(d2);
        
        State state = new State("Belarus");
        
        state.addRegion(r1);
        state.addRegion(r2);
        state.addRegion(r3);
        state.addRegion(r4);
        state.addRegion(r6);
        state.addRegion(r7);
        
        
      System.out.println("Information");
      
      System.out.println("The capital is "+stateLogic.getCapital(state));
      
      System.out.println("The square is "+state.getSquare());
      
      System.out.println("Number of regions is "+stateLogic.getNumberOfRegions());
      
      System.out.println("Region centers: "+stateLogic.getRegionCenter(state));
        
        

	}

}
