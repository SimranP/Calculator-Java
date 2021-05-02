package lib;

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
  public Double doOperation(Equation o1, Equation o2) {
    return o1.solve() / o2.solve();
  }
}
