package chapter3_decorator.starbuzz.condiment;

import chapter3_decorator.starbuzz.Beverage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Soy extends CondimentDecorator {
  Beverage beverage;

  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Soy";
  }

  @Override
  public double cost() {
    return .15 + this.beverage.cost();
  }
}
