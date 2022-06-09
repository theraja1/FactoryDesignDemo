package com.test;

import java.util.Scanner;

public class MainTest { 
		public static void main(String[] args) {
			String booking;
			System.out.println("Enter the AC class type>>");
			Scanner scanner = new Scanner(System.in);
			booking = scanner.next();
			
			
			Booking book = BookingFactory.getBooking(booking);
			
			System.out.println(book.getACClass());
			//code for develop branch..
			
			
			
			

		}
}
