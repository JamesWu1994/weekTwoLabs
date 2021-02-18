
public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int availablePlaneSeats = 6;
		double costOfGroceries = 23.64;
		char middleInitial = 'G';
		boolean isHotOutside = false;
		String customerFirstName = "Sally";
		String streetAddress = "1234 W Easy St";
		
		System.out.println ("Available seats on the plane" + availablePlaneSeats);
		System.out.println (costOfGroceries + " is the price for groceries");
		System.out.println ("The person's middle initial is" + middleInitial);
		System.out.println ("It is hot outside - " + isHotOutside);
		System.out.println ("The customer's first name is " + customerFirstName);
		System.out.println (streetAddress + "is where the person lives.");
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats -= 2;
		System.out.println (availablePlaneSeats);
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries += 2.15;
		System.out.println (costOfGroceries);
		
		//birth certificate was printed out incorrectly, change the middle initial to something else
		middleInitial = 'F';
		System.out.println (middleInitial);
		
		//the season has changed, update the hot outside variable to the opposite of what it is
		isHotOutside = true;
		System.out.println (isHotOutside);
		
		//create a new variable called full name using the customer's first name, middle initial, and last name of your choice
		String fullName = customerFirstName + " " + middleInitial + " Moon";
		System.out.println (fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		System.out.println ("Hello, my name is" + fullName + " and I live at" + streetAddress);
		 int day = 6;

		  int month = 4;

		  boolean isSummer= month >= 6 || month <= 8 ;

		  boolean isWeekday = day < 6;

		  if (isSummer && !isWeekday) {

		    System.out.println("Definitely going to sleep in!");

		  } else {

		    System.out.println("Probably need to wake up at a decent time.");
		
		double x = 589.0;
		boolean hasMoneyInPocket = (x == 589.0);
		System.out.println (hasMoneyInPocket);
	}

}
