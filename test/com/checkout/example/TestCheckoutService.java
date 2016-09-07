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
		float totalPrice = checkoutService.checkout(null);
		assertEquals(0.0f, totalPrice);		
	}
	
	public void testCheckout_empty_List(){
		List<String> items = new ArrayList<String>();
		float totalPrice = checkoutService.checkout(items);
		assertEquals(0.0f, totalPrice);		
	}
	
	public void testCheckout_apples_only_List(){
		List<String> items = create5ApplesList();
		float totalPrice = checkoutService.checkout(items);
		assertEquals(3.0f, totalPrice);		
	}
	
	public void testCheckout_oranges_only_List(){
		List<String> items = create4OrangesList();
		float totalPrice = checkoutService.checkout(items);
		assertEquals(1.00f, totalPrice);		
	}
	
	public void testCheckout_apple_oranges_mix_List1(){
		List<String> items = create2Apple2OrangesList1();
		float totalPrice = checkoutService.checkout(items);
		assertEquals(1.70f, totalPrice);		
	}
	
	public void testCheckout_apple_oranges_mix_List2(){
		List<String> items = create3Apple5OrangesList2();
		float totalPrice = checkoutService.checkout(items);
		assertEquals(3.05f, totalPrice);		
	}
	
	
	
	
	public void testCheckoutwithOffer_apples_only_List(){
		List<String> items = create5ApplesList();
		float totalPrice = checkoutService.checkoutWithOffer(items);
		assertEquals(1.8f, totalPrice);		
	}
	
	public void testCheckoutwithOffer_oranges_only_List(){
		List<String> items = create4OrangesList();
		float totalPrice = checkoutService.checkoutWithOffer(items);
		assertEquals(0.5f, totalPrice);		
	}
	
	public void testCheckoutwithOffer_apple_oranges_mix_List1(){
		List<String> items = create2Apple2OrangesList1();
		float totalPrice = checkoutService.checkoutWithOffer(items);
		assertEquals(1.1f, totalPrice);		
	}
	
	public void testCheckoutwithOffer_apple_oranges_mix_List2(){
		List<String> items = create3Apple5OrangesList2();
		float totalPrice = checkoutService.checkoutWithOffer(items);
		assertEquals(1.95f, totalPrice);		
	}
	
	
	
	
	private List<String> create5ApplesList(){
		
		List<String> items = new ArrayList<String>();
		
		String fruit1 = FruitsConstants.APPLE_NAME;
		
		String fruit2 = FruitsConstants.APPLE_NAME;
		
		String fruit3 = FruitsConstants.APPLE_NAME;
		
		String fruit4 = FruitsConstants.APPLE_NAME;
		
		String fruit5 = FruitsConstants.APPLE_NAME;
		
		items.add(fruit1);
		items.add(fruit2);
		items.add(fruit3);
		items.add(fruit4);
		items.add(fruit5);
		
		return items;
		
	}
	
	private List<String> create4OrangesList(){
		
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
	
	private List<String> create2Apple2OrangesList1(){
		
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
	
	private List<String> create3Apple5OrangesList2(){
		
		List<String> items = new ArrayList<String>();
		String fruit1 = FruitsConstants.ORANGE_NAME;
		
		String fruit2 = FruitsConstants.ORANGE_NAME;
		
		String fruit3 = FruitsConstants.ORANGE_NAME;
		
		String fruit4 = FruitsConstants.ORANGE_NAME;
		
		String fruit5 = FruitsConstants.ORANGE_NAME;
		
		String fruit6 = FruitsConstants.APPLE_NAME;
		
		String fruit7 = FruitsConstants.APPLE_NAME;
		
		String fruit8 = FruitsConstants.APPLE_NAME;
		
		items.add(fruit1);
		items.add(fruit2);
		items.add(fruit3);
		items.add(fruit4);
		items.add(fruit5);
		items.add(fruit6);
		items.add(fruit7);
		items.add(fruit8);
		
		return items;
		
	}
	

}
