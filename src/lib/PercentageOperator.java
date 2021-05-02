package lib;

import java.util.function.DoubleBinaryOperator;

public class PercentageOperator implements Operator {
  private static PercentageOperator single_instance = null;

  private PercentageOperator() {
  }

  public static PercentageOperator getInstance() {
    if (single_instance == null)
      single_instance = new PercentageOperator();

    return single_instance;
  }

  @Override
  public Double doOperation(Equation o1, Equation o2) {
    return o1.solve() / o2.solve() * 100;
  }
}
