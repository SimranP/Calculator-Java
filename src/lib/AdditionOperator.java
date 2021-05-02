package lib;

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
  public Double doOperation(Equation o1, Equation o2) {
    return o1.solve() + o2.solve();
  }
}
