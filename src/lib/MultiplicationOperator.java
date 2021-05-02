package lib;

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
  public Double doOperation(Equation o1, Equation o2) {
    return o1.solve() * o2.solve();
  }
}
