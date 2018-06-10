package chapter1_strategy;

import chapter1_strategy.flybehavior.FlyBehavior;
import chapter1_strategy.quackbehavior.QuackBehavior;
import lombok.Setter;


public abstract class Duck {
  @Setter
  FlyBehavior flyBehavior;
  @Setter
  QuackBehavior quackBehavior;

  public Duck() {
  }

  abstract void display();

  public void performFly() {
    this.flyBehavior.fly();
  }

  public void performQuack() {
    this.quackBehavior.quack();
  }

  public void swim() {
    System.out.println("All ducks float, even decoys!");
  }
}
