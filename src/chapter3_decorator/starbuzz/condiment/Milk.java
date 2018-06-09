package chapter3_decorator.starbuzz.condiment;

import chapter3_decorator.starbuzz.Beverage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Milk extends CondimentDecorator {
  Beverage beverage;

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }
}
