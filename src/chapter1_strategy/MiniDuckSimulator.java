package chapter1_strategy;

import chapter1_strategy.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {
 
  public static void main(final String[] args) {
 
    final MallardDuck	mallard = new MallardDuck();
    final RubberDuck	rubberDuckie = new RubberDuck();
    final DecoyDuck decoy = new DecoyDuck();

    final Duck model = new ModelDuck();

    mallard.performQuack();
    rubberDuckie.performQuack();
    decoy.performQuack();
   
    model.performFly();
    model.setFlyBehavior(new FlyRocketPowered());
    model.performFly();
  }
}
