package lift;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import lift.Lift;
import lift.LiftServiceImplementation;

public class Main {

	public static void main(String[] args) {
		
		start();
	}
	
	static void start() {
		
		Scanner sc=new Scanner(System.in);
		
		LiftServiceImplementation l =new LiftServiceImplementation();
		
		
		try {
			System.out.print("Enter number Of Lift To Build: ");
			int ln=sc.nextInt();
			
			ArrayList<Lift> liftArr = new ArrayList<>(); 
			for(int i=0;i<ln;i++) {
				liftArr.add(new Lift());
			}
			
			new Lift();
			
			System.out.print("Lift and Flores are builded\n");
		
			
			while(true) {
				try {
					System.out.print("\nEnter the Lift Number: ");
					int lift=sc.nextInt();
					
					if(lift<=liftArr.size()) {
						System.out.print("Enter the Current Flore Number: ");
						int curFloor=sc.nextInt();
						
						if(curFloor<=l.receiveMaxFlore(liftArr.get(lift-1))) {
							l.move(liftArr.get(lift-1),curFloor);
							
							System.out.print("Enter the Destination Flore Number: ");
							int desFloor=sc.nextInt();
							
							if(desFloor<=l.receiveMaxFlore(liftArr.get(lift-1))) {
								l.move(liftArr.get(lift-1),desFloor);
							}else {
								System.out.println("Invalid Destination Flore Number");
							}
						}else {
							System.out.println("Invalid Current Flore Number");
						}
						
					}else{
						System.out.println("Invalid Lift Number");
					}
					
					System.out.println("Press X to Exit");
		            if (sc.nextLine().toLowerCase().equals("x")) {
		                break;
		            }
					System.out.println();
			
				
				
				}catch(InputMismatchException e) {
					System.out.println("Exception: Invalid Input");
					sc.next();
				}
			}
			
			System.out.println("Exited From Lift");
		
		}catch(InputMismatchException e) {
			System.out.println("Exception: Invalid Input");
		}
	}

}
