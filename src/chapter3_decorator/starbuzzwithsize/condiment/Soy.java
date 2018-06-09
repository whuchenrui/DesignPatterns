package chapter3_decorator.starbuzzwithsize.condiment;

import chapter3_decorator.starbuzzwithsize.Beverage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Soy extends CondimentDecorator {
	Beverage beverage;

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		double cost = beverage.cost();
		if (beverage.getSize() == Size.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += 1.20;
		}
		return cost;
	}
}
