package lift;

import java.util.Scanner;

class Lift{
	static int desPos;
	int curPos = 0;
	static final int maxFlore;
	
	static {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number Of Flore To Build: ");
		maxFlore=sc.nextInt();
	}
}

interface LiftService{
	abstract void move(Lift ob, int des);
}
