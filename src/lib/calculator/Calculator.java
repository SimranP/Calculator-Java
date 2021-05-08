package lib.calculator;

import static lib.calculator.Equation.parseEquation;

public class Calculator {
  public Calculator() {
  }

  public Double execute(String s) {
    return parseEquation(s).solve();
  }
}
