package main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		//5, 25, 50, 55, 75, 100 (all % 5 == 0)
		if (number % 5 == 0 && number % 7 != 0) {
			return "Fizz";
		}
		//7, 49, 84, 91, 98, 28 (all % 7 == 0)
		else if (number % 5 != 0 && number % 7 == 0) {
			return "Buzz";
		}
		//35, 140, 280, 1120, 70, 105 (%5 AND %7 == 0)
		else if (number % 5 == 0 && number % 7 == 0) {
			return "FizzBuzz";
		}
		
		else return "Booom... no match";
	}
}
