package chapter1_strategy.flybehavior;

public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("I can't flybehavior");
	}
}
