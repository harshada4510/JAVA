package carParkingSystem;


import java.time.LocalTime;
import java.util.Scanner;

public class Parking {
	public Car cars[]= new Car[5];
	public  void addCarToParking() {
		Scanner sc=new Scanner(System.in);
		int size=0;
		for(Car car :cars ) {
			if(car.getCarRegistrationNumber().equals(null))
					break;
			size++;
		}
		if(size<5 || size == 0) {
			System.out.println("Enter the Car Registration Number");
			String regNo=sc.nextLine();
			System.out.println("Enter the Owner Name");
			String nm=sc.nextLine();
			System.out.println("Enter Owner's Mobile number");
			int mob=sc.nextInt();
			LocalTime intime=LocalTime.now();
			Car c1=new Car(regNo,nm,mob,intime,null);
			cars[size]=c1;
			System.out.println("Added to the parking Sysytem....");
		}
		else {
			System.out.println("Parking is full");
		}
		
		
	}
	public void getDetails() {
		Scanner sc=new Scanner(System.in);
		int size=cars.length;
		int count=0;
		System.out.println("Enter the Car Registration Number");
		String regNo=sc.nextLine();
		for(Car car :cars ) {
			if(car.getCarRegistrationNumber().equals(regNo))
				{	System.out.println("Details of the Parked Car are: \nOwner Name:"+car.getCarOwnerName()); 
					System.out.println("Mobile Number:"+car.getCarRegistrationNumber()+"\nIn-TIME :"+car.getInTime());
					count++;
					break;
				}
		}
		if(count==0)
			System.out.println("Sorry! Entered Registration Number not exits..");
	}
	
	
	public void removeFromParking() {
		Scanner sc=new Scanner(System.in);
		int size=cars.length;
		int count=0;
		System.out.println("Enter the Car Registration Number");
		String regNo=sc.nextLine();
		for(Car car :cars ) {
			if(car.getCarRegistrationNumber().equals(regNo))
				{	System.out.println(car);
					car.setCarRegistrationNumber(null);
					car.setCarOwnerName(null);
					car.setInTime(null);
					car.setOutTime(null);car.setOwnerMobileNumber(0);
					count++;
					break;
				}
		}
		if(count==0)
			System.out.println("Sorry! Entered Registration Number not exits..");
	}
	
	
}
