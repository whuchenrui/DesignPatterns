package chapter3_decorator.starbuzzwithsize;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Beverage {
  public enum Size { TALL, GRANDE, VENTI }

  @Setter
  Size size = Size.TALL;
  protected String description = "Unknown Beverage";

  public abstract double cost();
}
