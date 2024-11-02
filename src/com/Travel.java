package com;

import java.util.ArrayList;
import java.util.List;

public class Travel {

	public boolean isCarDriver(Driver driver) {
		if (driver.getCategory().equalsIgnoreCase("Car")) {
			return true;
		}
		return false;
	}
	
	public String retrivebyDriverId(ArrayList<Driver> driver, int id) {
		for (Driver drv : driver) {
			if(drv.getDriverId() == id) {
				return "Driver name is " +
			drv.getDriverName() + " Belonging to the category " +
			drv.getCategory() + " traveled " +
			drv.getTotalDistance() + " KM so far";
			}
			
		}
		return "No driver found with that reference ID";
	}
	
	public int retriveCountOfDriver(ArrayList<Driver> driver,String category) {
		int count = 0;
		for (Driver dv : driver) {
			if (dv.getCategory().equalsIgnoreCase(category)) {
				count++;
			}
		}
		return count;
	
	}
	
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> driver, String category){
		ArrayList<Driver> updatedlist = new ArrayList<>();
		for (Driver dv: driver) {
			if (dv.getCategory().equalsIgnoreCase(category)) {
				updatedlist.add(dv);
			}
		}
		return updatedlist;
	}
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> driver) {
		Driver dvr = new Driver();
		for (Driver dv:driver) {
			if (dv.getTotalDistance() > dvr.getTotalDistance()) {
				dvr = dv;
			}
		}
		return dvr;
		
	}
}
