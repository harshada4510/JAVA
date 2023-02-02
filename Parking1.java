package carParkingSystem;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Parking1 {
	
	ArrayList<Car> cars = new ArrayList<Car>();
	//int index=0;
	public  void addCarToParking() throws ParkingFullException {
		Scanner sc=new Scanner(System.in);
		
		if( cars.size()<5 ) {
			//index++;
			System.out.println("Enter the Car Registration Number");
			String regNo=sc.nextLine();
			System.out.println("Enter the Owner Name");
			String nm=sc.nextLine();
			System.out.println("Enter Owner's Mobile number");
			int mob=sc.nextInt();
			LocalTime intime=LocalTime.now();
			Car c1=new Car(regNo,nm,mob,intime,null);
			cars.add(c1);
			System.out.println("Added to the parking Sysytem....");
		}
		else {
			ParkingFullException pf=new ParkingFullException();
			throw pf;
		}
		
		
	}
	
	public void getDetails() {
		Scanner sc=new Scanner(System.in);
		int size=cars.size();
		int count=0;
		System.out.println("Enter the Car Registration Number");
		String regNo=sc.nextLine();
		System.out.println(cars.size());
		for(Car car :cars ) {
			if(car.getCarRegistrationNumber().equals(regNo))
				{	System.out.println("Details of the Parked Car are: \nOwner Name:"+car.getCarOwnerName()); 
					System.out.println("Mobile Number:"+car.getCarRegistrationNumber()+"\nIn-TIME :"+car.getInTime());
					count++;
					break;
				}
		}
		if(count==0 || size==0)
			System.out.println("Sorry! Entered Registration Number not exits..");
	}
	
	public void removeFromParking() {
		Scanner sc=new Scanner(System.in);
		int size=cars.size();
		int count=0;
		System.out.println("Enter the Car Registration Number");
		String regNo=sc.nextLine();
		for(Car car :cars ) {
			if(car.getCarRegistrationNumber().equals(regNo))
				{	System.out.println(car);
					count++;
					break;
				}
		}
		if(count==0 ||size==0)
			System.out.println("Sorry! Entered Registration Number not exits..");
	}
	
}
