package chapter3_decorator.starbuzzwithsize.condiment;

import chapter3_decorator.starbuzzwithsize.Beverage;

public abstract class CondimentDecorator extends Beverage {
  @Override
  public abstract String getDescription();
}
