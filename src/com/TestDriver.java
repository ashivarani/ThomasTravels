package com;

import java.util.ArrayList;

public class TestDriver {

	public static void main(String[] args) {
		ArrayList<Driver> driver = new ArrayList<>();
		driver.add(new Driver("car",1,11000,"Rama"));
		driver.add(new Driver("Lorry",3,6000,"Sugriva"));
		driver.add(new Driver("Auto",5,9312,"Laxman"));
		driver.add(new Driver("Lorry",4,99400,"Hanuman"));
		driver.add(new Driver("Auto",2,7013,"Baratha"));
		driver.add(new Driver("car",6,5908,"Shathrugna"));
		Travel tl = new Travel();
		//Checking whether is it car driver or not
		System.out.println("Is Car : " + tl.isCarDriver(driver.get(5)));
		//Return the specific driver with using ID
		System.out.println(tl.retrivebyDriverId(driver, 2));
		//Retrieve the count of drivers based on the category
		System.out.println("Count of drivers: " + tl.retriveCountOfDriver(driver, "Auto"));
		//Retrieve the List of drivers in that specific category
		ArrayList<Driver> newDriver =tl.retriveDriver(driver,"Lorry");
		System.out.println("Array list of drivers in the category: \n" + newDriver);
		//Maximum distance  driver
		System.out.println("Max distance travelled Driver: \n" + tl.retriveMaximumDistanceTravelledDriver(driver));
		
		
		
	}

}
