package chapter1_strategy.quackbehavior;

public class MuteQuack implements QuackBehavior {
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
