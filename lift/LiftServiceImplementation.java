package lift;


public class LiftServiceImplementation {
	
	public int receiveMaxFlore(Lift ob) {
		return ob.maxFlore;
	}
	
	public void setDesPos(Lift ob, int pos) {
		ob.desPos=pos;
	}
	
	public void setCurPos(Lift ob, int pos) {
		ob.curPos=pos;
	}
	public int getCurPos(Lift ob) {
		return ob.curPos;
	}
	
	
	public void move(Lift ob, int des) {
		if(des<=ob.maxFlore) {
			if(getCurPos(ob)==des) {
				System.out.println("\nLift Existing in same floor");
			}else {
				System.out.println("Lift Current Position: "+getCurPos(ob));
				setDesPos(ob, des);
				System.out.println("Lift Moving To "+des+" Flore");
				setCurPos(ob, des);
				System.out.println("Lift Current Position: "+getCurPos(ob));
			}
			
		}else {
			System.out.println("Wrong Flore Number");
		}
		System.out.println();
	}
}
