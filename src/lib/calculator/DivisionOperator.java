package lib.calculator;

import java.util.List;

public class DivisionOperator implements Operator {
  private static DivisionOperator single_instance = null;

  private DivisionOperator() {
  }

  public static DivisionOperator getInstance() {
    if (single_instance == null)
      single_instance = new DivisionOperator();

    return single_instance;
  }

  @Override
  public Double doOperation(List<Equation> operands) {
    Equation acc = new Equation(operands.get(0).solve() / operands.get(1).solve());
    for (int i = 2; i < operands.size(); i++) {
      Equation operand = operands.get(i);
      acc = new Equation(acc.solve() / operand.solve());
    }
    return acc
      .solve();
  }
}
