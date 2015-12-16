package fr.alecharp.demo;

public class App {
  public String getX() {
    return "foo";
  }

  public String getY() {
    return getX();
  }
}
