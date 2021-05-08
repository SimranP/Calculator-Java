package lib;

import java.util.List;

public class AdditionOperator implements Operator {
  private static AdditionOperator single_instance = null;

  private AdditionOperator() {
  }

  public static AdditionOperator getInstance() {
    if (single_instance == null)
      single_instance = new AdditionOperator();

    return single_instance;
  }

  @Override
  public Double doOperation(List<Equation> operands) {
    return operands.stream().reduce(new Equation(0.0), (a, b) ->
      new Equation(a.solve() + b.solve())).solve();
  }
}
