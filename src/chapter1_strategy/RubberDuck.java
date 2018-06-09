package chapter1_strategy;

import chapter1_strategy.flybehavior.FlyNoWay;
import chapter1_strategy.quackbehavior.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	@Override
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
