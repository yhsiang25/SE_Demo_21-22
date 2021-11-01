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
		for (int i = current_Floor; i > dest_Floor ; i--) {
				System.out.println(State.Current_State + " to " + i + getEnding(i) + " Floor");
			}
		System.out.println("Arriving " + dest_Floor + getEnding(dest_Floor) + " Floor");
	}
	
	public void stayIdle() {
		
		System.out.println("... " + State.Current_State + " Current Floor: " + dest_Floor);
	}
	
	/**
	 * this method compute the ordinal number of the given floor.
	 * @param floor (integer) is the current floor we want to compute the ordinal number for.
	 * @return the ending of the ordinal number in String
	 */
	private String getEnding (int floor) {
		String output = "";	
		switch (floor) {
			case 0: output = "";
			break;
			case 1: output = "st";
			break;
			case 2: output = "nd";
			break;
			case 3: output = "rd";
			break;
			default: output = "th";
		}
	
		return output;
	}
}
