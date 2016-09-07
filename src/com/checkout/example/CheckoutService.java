package com.checkout.example;

import java.util.List;

import com.checkout.constants.FruitsConstants;

public class CheckoutService {
	
	/**
	 * This API checks the input fruit named passed as input list and based on fruit name it
	 * calculates the total price for checkout.
	 * 
	 * @param items - input all fruits items (assumption input as list of fruit names)
	 * @return double - total price for all fruits checkout.
	 */
	public double checkout(List<String> items){
		double totalPrice = 0;
		int appleCounter = 0;
		int orangeCounter = 0;
		
		if(items != null && items.size()>0){
			for(String fruitName :items){
				if(fruitName.equalsIgnoreCase(FruitsConstants.APPLE_NAME)){
					appleCounter++;
				}else if(fruitName.equalsIgnoreCase(FruitsConstants.ORANGE_NAME)){
					orangeCounter++;
				}
			}
			
			totalPrice = (FruitsConstants.APPLE_PRICE * appleCounter) + (FruitsConstants.ORANGE_PRICE * orangeCounter);
		}
		
		return totalPrice;
		
	}

}
