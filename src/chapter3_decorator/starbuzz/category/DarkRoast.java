package chapter3_decorator.starbuzz.category;

import chapter3_decorator.starbuzz.Beverage;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    this.description = "Dark Roast Coffee";
  }
 
  @Override
  public double cost() {
    return .99;
  }
}

