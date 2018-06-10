package chapter3_decorator.starbuzz.category;

import chapter3_decorator.starbuzz.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    this.description = "House Blend Coffee";
  }
 
  @Override
  public double cost() {
    return .89;
  }
}

