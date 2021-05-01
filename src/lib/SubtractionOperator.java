package lib;

public class SubtractionOperator implements Operator {
  private static SubtractionOperator single_instance = null;

  private SubtractionOperator() {
  }

  public static SubtractionOperator getInstance() {
    if (single_instance == null)
      single_instance = new SubtractionOperator();

    return single_instance;
  }

  @Override
  public Integer doOperation(Equation o1, Equation o2) {
    return o1.solve() - o2.solve();
  }
}
