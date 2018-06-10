package chapter3_decorator.starbuzzwithsize.condiment;

import chapter3_decorator.starbuzzwithsize.Beverage;
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
    double cost = this.beverage.cost();
    if (this.beverage.getSize() == Size.TALL) {
      cost += .10;
    } else if (this.beverage.getSize() == Size.GRANDE) {
      cost += .15;
    } else if (this.beverage.getSize() == Size.VENTI) {
      cost += 1.20;
    }
    return cost;
  }
}
