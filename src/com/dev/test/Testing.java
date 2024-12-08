package com.dev.test;

import com.dev.buyfactory.BuyFactory;
import com.dev.service.MobileService;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobileService service =BuyFactory.getInstance("raj10");
		System.out.println(service.buy(new String[]{"t-shirt", "pant","shoe"},new double[]{120.50,250.00,500.50}));
	}
}
