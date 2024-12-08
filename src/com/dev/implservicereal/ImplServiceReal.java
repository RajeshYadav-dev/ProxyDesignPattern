package com.dev.implservicereal;

import com.dev.service.MobileService;

public class ImplServiceReal implements MobileService{

	@Override
	public double buy(String[] item, double[] prices) {
		double bill = 0;
		for(double price:prices) {
			bill +=price;
		}
		return bill;
	}
}
