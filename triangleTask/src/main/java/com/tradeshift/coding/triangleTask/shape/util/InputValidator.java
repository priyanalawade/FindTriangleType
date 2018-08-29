package com.tradeshift.coding.triangleTask.shape.util;

public class InputValidator {
	
	public static boolean validateInput(String[] inputValues){
		
		if (inputValues == null || inputValues.length == 0) {
			throw new IllegalArgumentException("You have not entered any value.");
		}
		
		for (String value : inputValues) {
			if (!value.matches("\\d+")) {
				throw new IllegalArgumentException("You have not entered number.");
			}
		}
		return false;
		
	}

}
