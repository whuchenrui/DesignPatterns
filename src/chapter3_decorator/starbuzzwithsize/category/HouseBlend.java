package chapter3_decorator.starbuzzwithsize.category;

import chapter3_decorator.starbuzzwithsize.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}
 
	@Override
	public double cost() {
		return .89;
	}
}

