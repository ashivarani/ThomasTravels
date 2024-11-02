package com;

public class Driver {
	private String category;
	private int driverId;
	private double totalDistance;
	private String driverName;
	@Override
	public String toString() {
		return "Driver [category=" + category + ", driverId=" + driverId + ", totalDistance=" + totalDistance
				+ ", driverName=" + driverName + "]";
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDriverId() {
		return driverId;
	}
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	public void setTotalDistance(double totalDistance) {
		this.totalDistance = totalDistance;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Driver(String category, int driverId, double totalDistance, String driverName) {
		super();
		this.category = category;
		this.driverId = driverId;
		this.totalDistance = totalDistance;
		this.driverName = driverName;
	}
	public Driver() {
		super();
	}

}
