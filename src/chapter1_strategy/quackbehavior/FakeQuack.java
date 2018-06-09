package chapter1_strategy.quackbehavior;

public class FakeQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("Qwak");
	}
}
