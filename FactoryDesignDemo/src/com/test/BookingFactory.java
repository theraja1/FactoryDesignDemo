package com.test;

public class BookingFactory {
	
	
	public static Booking getBooking(String input) {
		if (input.equalsIgnoreCase("first")) {
			return new FirstClass();
		}else if(input.equalsIgnoreCase("second")) {
			return new SecondClass();
		}else if (input.equalsIgnoreCase("third")) {
			return new ThirdClass();
		}
		
		throw new IllegalArgumentException("Invalid input from user..");
		// throw new IllegalArgumentException("Invalid input from user..");
		
	}

}
