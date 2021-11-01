package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ this.dest_Floor);
	arrive_atFloor();


	}


	private void arrive_atFloor() {

		State.Current_State = State.Idle;
		if (current_Floor < this.dest_Floor) {
			goUp();	
		}
		else if (current_Floor > this.dest_Floor) {
			goDown();
		}
		else {
			stayIdle();
		}
	}
	
	public void goUp() {
		State.Current_State = State.Moving_up;
		for (int i = current_Floor; i < dest_Floor ; i++) {
				System.out.println(State.Current_State + " to " + i + "th Floor");
			}
		System.out.println("Arriving " + dest_Floor + "th Floor");
	}
	
	public void goDown() {
		State.Current_State = State.Moving_down;
		String num = "";
		for (int i = current_Floor; i > dest_Floor ; i--) {
			if (i == 1) {num = "st";}
			else if (i == 2) {num = "nd";}
			else if (i == 3) {num = "rd";}
			else if (i == 0) {num = "";}
			else {num = "th";}
				System.out.println(State.Current_State + " to " + i + num + " Floor");
			}
		if (dest_Floor == 1) {num = "st";}
		else if (dest_Floor == 2) {num = "nd";}
		else if (dest_Floor == 3) {num = "rd";}
		else if (dest_Floor == 0) {num = "";}
		else {num = "th";}
		System.out.println("Arriving " + dest_Floor + num + " Floor");
	}
	
	public void stayIdle() {
		
		System.out.println("... " + State.Current_State + " Current Floor: " + dest_Floor);
	}
}
