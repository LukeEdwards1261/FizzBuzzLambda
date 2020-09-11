package com.qa;

import java.util.ArrayList;

public class FizzBuzzLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 1; i<=200; i++) {
		arrayList.add(i);
		}
		
//		arrayList.forEach(x -> { if (x % 3 != 0 && x % 5 != 0) System.out.println(x); 
//								else if (x % 3 == 0 && x % 5 != 0) System.out.println("Fizz");
//								else if (x % 5 == 0 && x % 3 != 0) System.out.println("Buzz");
//								else if (x % 5 == 0 && x % 3 == 0) System.out.println("FizzBuzz");});
		
//		String Fizzyboi = "";
		
		arrayList.forEach(x -> {
			String Fizzyboi = "";
		if (x % 3 == 0) Fizzyboi = Fizzyboi+"Fizz"; 
		if (x % 5 == 0 ) Fizzyboi = Fizzyboi +"Buzz";
		if (Fizzyboi == "") {System.out.println(x);}
		else System.out.println(Fizzyboi);
		});
		
		
//		arrayList.forEach(x -> { if (x % 3 == 0) System.out.println("Fizz");});
//		arrayList.forEach(x -> { if (x % 5 == 0) System.out.println("Buzz");});
		
	}

}
