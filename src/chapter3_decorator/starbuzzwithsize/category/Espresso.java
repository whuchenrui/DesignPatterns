package chapter3_decorator.starbuzzwithsize.category;

import chapter3_decorator.starbuzzwithsize.Beverage;

public class Espresso extends Beverage {
  
  public Espresso() {
    this.description = "Espresso";
  }
  
  @Override
  public double cost() {
    return 1.99;
  }
}

