package lib;

import static lib.Equation.parseEquation;

public class Calculator {
  public Calculator() {
  }

  public Double execute(String s) {
    return parseEquation(s).solve();
  }
}
