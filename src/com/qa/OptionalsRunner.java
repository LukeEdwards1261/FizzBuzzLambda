package com.qa;

import java.util.Optional;

public class OptionalsRunner {

	public static void main(String[] args) {
		
		String item;
		if(Math.random() >= 0.5) {
		    item = "Hello";
		    System.out.println(item);
		} else {
		    item = null;
		}
		
		//Optional.ofNullable(item);
		
		Optional<String> TrueOrNull = Optional.ofNullable(item);
//		System.out.println(TrueOrNull.isPresent()); 
//		
//		System.out.println(TrueOrNull.orElse("Item not found"));
		
		TrueOrNull = TrueOrNull.map(theItem ->  "chocolate fireguard ");
		TrueOrNull.ifPresent(theItem -> System.out.println(theItem + "found"));
		System.out.println(TrueOrNull.orElseThrow(() -> new RuntimeException("Item Not Found")));
		
		System.out.println("iubofvadb");
		
		System.out.println(TrueOrNull.get());
	}

}
