package carParkingSystem;

import java.util.Scanner;

public class parkingSystemExample {

	public static void main(String[] args) {
		int choice=0;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Add Car to Parking \n2.Get Parked Car Details \n3.Remove Car From Parking \n4.Exit");
			choice=sc.nextInt();
			Parking p1=new Parking();
			
			switch(choice){
			case 1: 
					p1.addCarToParking();
					break;
			case 2: 
				p1.getDetails();
				break ;
				
			case 3: 
				p1.removeFromParking();
				break;
				
			case 4: break;
			default: break;
			}
		}while(choice!=4);
		
	}

}
