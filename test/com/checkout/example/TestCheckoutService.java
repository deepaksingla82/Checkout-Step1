/**
 * 
 */
package com.checkout.example;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.checkout.constants.FruitsConstants;

/**
 * @author Singla
 *
 */
public class TestCheckoutService extends TestCase {
	
	private CheckoutService checkoutService= null;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		checkoutService = new CheckoutService();
	}
	
	public void testCheckout_null_List(){
		double totalPrice = checkoutService.checkout(null);
		assertEquals(0.0, totalPrice);		
	}
	
	public void testCheckout_empty_List(){
		List<String> items = new ArrayList<String>();
		double totalPrice = checkoutService.checkout(items);
		assertEquals(0.0, totalPrice);		
	}
	
	public void testCheckout_apples_only_List(){
		List<String> items = createApplesList();
		double totalPrice = checkoutService.checkout(items);
		assertEquals(2.40, totalPrice);		
	}
	
	public void testCheckout_oranges_only_List(){
		List<String> items = createOrangesList();
		double totalPrice = checkoutService.checkout(items);
		assertEquals(1.00, totalPrice);		
	}
	
	public void testCheckout_apple_oranges_mix_List1(){
		List<String> items = createAppleOrangesList1();
		double totalPrice = checkoutService.checkout(items);
		assertEquals(1.70, totalPrice);		
	}
	
	public void testCheckout_apple_oranges_mix_List2(){
		List<String> items = createAppleOrangesList2();
		double totalPrice = checkoutService.checkout(items);
		assertEquals(2.2, totalPrice);		
	}
	
	
	
	private List<String> createApplesList(){
		
		List<String> items = new ArrayList<String>();
		
		String fruit1 = FruitsConstants.APPLE_NAME;
		
		String fruit2 = FruitsConstants.APPLE_NAME;
		
		String fruit3 = FruitsConstants.APPLE_NAME;
		
		String fruit4 = FruitsConstants.APPLE_NAME;
		
		items.add(fruit1);
		items.add(fruit2);
		items.add(fruit3);
		items.add(fruit4);
		
		return items;
		
	}
	
	private List<String> createOrangesList(){
		
		List<String> items = new ArrayList<String>();
		
		String fruit1 = FruitsConstants.ORANGE_NAME;
		
		String fruit2 = FruitsConstants.ORANGE_NAME;
		
		String fruit3 = FruitsConstants.ORANGE_NAME;
		
		String fruit4 = FruitsConstants.ORANGE_NAME;
		
		items.add(fruit1);
		items.add(fruit2);
		items.add(fruit3);
		items.add(fruit4);
		
		return items;
		
	}
	
	private List<String> createAppleOrangesList1(){
		
		List<String> items = new ArrayList<String>();
		
		String fruit1 = FruitsConstants.ORANGE_NAME;
		
		String fruit2 = FruitsConstants.ORANGE_NAME;
		
		String fruit3 = FruitsConstants.APPLE_NAME;
		
		String fruit4 = FruitsConstants.APPLE_NAME;
		
		items.add(fruit1);
		items.add(fruit2);
		items.add(fruit3);
		items.add(fruit4);
		
		return items;
		
	}
	
	private List<String> createAppleOrangesList2(){
		
		List<String> items = new ArrayList<String>();
		String fruit1 = FruitsConstants.ORANGE_NAME;
		
		String fruit2 = FruitsConstants.ORANGE_NAME;
		
		String fruit3 = FruitsConstants.ORANGE_NAME;
		
		String fruit4 = FruitsConstants.ORANGE_NAME;
		
		String fruit5 = FruitsConstants.APPLE_NAME;
		
		String fruit6 = FruitsConstants.APPLE_NAME;
		
		items.add(fruit1);
		items.add(fruit2);
		items.add(fruit3);
		items.add(fruit4);
		items.add(fruit5);
		items.add(fruit6);
		
		return items;
		
	}
	

}
