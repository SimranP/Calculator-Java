package lib;

import java.util.List;

public class MultiplicationOperator implements Operator {
  private static MultiplicationOperator single_instance = null;

  private MultiplicationOperator() {
  }

  public static MultiplicationOperator getInstance() {
    if (single_instance == null)
      single_instance = new MultiplicationOperator();

    return single_instance;
  }

  @Override

  public Double doOperation(List<Equation> operands) {
    return operands.stream().reduce(new Equation(1.0), (a, b) -> {
      return new Equation(a.solve() * b.solve());
    }).solve();
  }
}
