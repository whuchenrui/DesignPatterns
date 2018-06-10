package chapter2_observer.weather.subject;

import chapter2_observer.weather.observer.Observer;

public interface Subject {
  public void registerObserver(Observer o);
  public void removeObserver(Observer o);
  public void notifyObservers();
}
