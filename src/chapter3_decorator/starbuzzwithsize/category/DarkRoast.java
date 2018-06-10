package chapter3_decorator.starbuzzwithsize.category;

import chapter3_decorator.starbuzzwithsize.Beverage;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    this.description = "Dark Roast Coffee";
  }
 
  @Override
  public double cost() {
    return .99;
  }
}

