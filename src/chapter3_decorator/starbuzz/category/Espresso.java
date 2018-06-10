package chapter3_decorator.starbuzz.category;

import chapter3_decorator.starbuzz.Beverage;

public class Espresso extends Beverage {
  
  public Espresso() {
    this.description = "Espresso";
  }
  
  @Override
  public double cost() {
    return 1.99;
  }
}

