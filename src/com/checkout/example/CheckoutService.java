package com.checkout.example;

import java.util.List;

import com.checkout.constants.FruitsConstants;

public class CheckoutService {
	
	final private boolean isOfferexist = true;
	
	/**
	 * This API checks the input fruit named passed as input list and based on fruit name it
	 * calculates the total price for checkout.
	 * 
	 * @param items - input all fruits items (assumption input as list of fruit names)
	 * @return float - total price for all fruits checkout.
	 */
	public float checkout(List<String> items){
		float totalPrice = 0;
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
			totalPrice = (float) ((FruitsConstants.APPLE_PRICE * appleCounter) + (FruitsConstants.ORANGE_PRICE * orangeCounter));
		}
		return totalPrice;
	}
	
	/**
	 * This API checks the input fruit named passed as input list and based on fruit name it
	 * calculates the total price for checkout.
	 * 
	 * @param items - input all fruits items (assumption input as list of fruit names)
	 * @return float - total price for all fruits checkout.
	 */
	public float checkoutWithOffer(List<String> items){
		float totalPrice = 0;
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
			
			if(isOfferexist){
				totalPrice = calculateTotalPriceWithOffer(appleCounter,orangeCounter);
			}else{
			
			totalPrice = (float) ((float)(FruitsConstants.APPLE_PRICE * appleCounter) + (FruitsConstants.ORANGE_PRICE * orangeCounter));
			
			}
		}
		return totalPrice;
	}
	
	/**
	 * This API calculates the total price for checkout with some offer applied.
	 * 
	 * @param appleCounter - total apple purchased by customer
	 * @param orangeCounter - total orange purchased by customer.
	 * @return float - total price with offer applied.
	 */
	private float calculateTotalPriceWithOffer(int appleCounter, int orangeCounter){
		float totalPriceWithOffer = 0.0f;
		float appleCost = 0.0f;
		float orangeCost = 0.0f;
		
		int afterOfferOrangeCounter = 0;
		int afterOfferAppleCounter = 0;
		
		if(appleCounter%2 == 0){
			appleCost = (float) ((appleCounter * FruitsConstants.APPLE_PRICE) / 2);
		}
		else{
			afterOfferAppleCounter = (appleCounter / 2) + 1;
			appleCost = (float) (FruitsConstants.APPLE_PRICE * afterOfferAppleCounter);
		}
		
		if(orangeCounter%3 == 0){
			orangeCost = (float) ((orangeCounter/3) * FruitsConstants.ORANGE_PRICE * 2);
		}
		else if(orangeCounter%3 == 2){
			afterOfferOrangeCounter = orangeCounter/3 + 2;
			orangeCost = (float) (FruitsConstants.ORANGE_PRICE * afterOfferOrangeCounter) ;
		}
		else{
			afterOfferOrangeCounter = orangeCounter/3 + 1;
			orangeCost = (float) (FruitsConstants.ORANGE_PRICE * afterOfferOrangeCounter) ;
		}
		
		totalPriceWithOffer = appleCost + orangeCost;
		
		return totalPriceWithOffer;
	}

}
