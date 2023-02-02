package carParkingSystem;

import java.time.LocalTime;

public class Car {
	private String carRegistrationNumber;
	private String carOwnerName;
	private int ownerMobileNumber;
	private LocalTime inTime;
	private LocalTime outTime;

	public Car(String carRegistrationNumber, String carOwnerName, int ownerMobileNumber, LocalTime inTime,
			LocalTime outTime) {
		super();
		this.carRegistrationNumber = carRegistrationNumber;
		this.carOwnerName = carOwnerName;
		this.ownerMobileNumber = ownerMobileNumber;
		this.inTime = inTime;
		this.outTime = outTime;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}

	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}

	public String getCarOwnerName() {
		return carOwnerName;
	}

	public void setCarOwnerName(String carOwnerName) {
		this.carOwnerName = carOwnerName;
	}

	public int getOwnerMobileNumber() {
		return ownerMobileNumber;
	}

	public void setOwnerMobileNumber(int ownerMobileNumber) {
		this.ownerMobileNumber = ownerMobileNumber;
	}

	public LocalTime getInTime() {
		return inTime;
	}

	public void setInTime(LocalTime inTime) {
		this.inTime = inTime;
	}

	public LocalTime getOutTime() {
		return outTime;
	}

	public void setOutTime(LocalTime outTime) {
		this.outTime = outTime;
	}

	@Override
	public String toString() {
		return "Car Registration Number=" + carRegistrationNumber + "\n car Owner Name=" + carOwnerName
				+ "\n owner Mobile Number=" + ownerMobileNumber + "\n In-Time=" + inTime + "\nOut-Time=" + outTime ;
	}

	
	
	
}
