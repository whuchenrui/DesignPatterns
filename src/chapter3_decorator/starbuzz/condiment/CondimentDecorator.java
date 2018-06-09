package chapter3_decorator.starbuzz.condiment;

import chapter3_decorator.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
	@Override
	public abstract String getDescription();
}
