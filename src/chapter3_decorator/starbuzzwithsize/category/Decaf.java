package chapter3_decorator.starbuzzwithsize.category;

import chapter3_decorator.starbuzzwithsize.Beverage;

public class Decaf extends Beverage {
  public Decaf() {
    this.description = "Decaf Coffee";
  }
 
  @Override
  public double cost() {
    return 1.05;
  }
}

