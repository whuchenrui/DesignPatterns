package chapter3_decorator.starbuzz;

import lombok.Getter;

public abstract class Beverage {

  @Getter
  protected String description = "Unknown Beverage";
  
  public abstract double cost();
}
