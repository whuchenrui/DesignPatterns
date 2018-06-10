package chapter1_strategy.quackbehavior;

public class Squeak implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
