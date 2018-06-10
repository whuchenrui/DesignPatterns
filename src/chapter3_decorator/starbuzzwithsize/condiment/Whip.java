package chapter3_decorator.starbuzzwithsize.condiment;

import chapter3_decorator.starbuzzwithsize.Beverage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Whip extends CondimentDecorator {
  Beverage beverage;
 
  @Override
  public String getDescription() {
    return this.beverage.getDescription() + ", Whip";
  }
 
  @Override
  public double cost() {
    return .10 + this.beverage.cost();
  }
}
