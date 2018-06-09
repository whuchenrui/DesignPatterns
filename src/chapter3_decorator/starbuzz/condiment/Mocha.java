package chapter3_decorator.starbuzz.condiment;

import chapter3_decorator.starbuzz.Beverage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Mocha extends CondimentDecorator {
	Beverage beverage;
 
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	@Override
	public double cost() {
		return .20 + beverage.cost();
	}
}
