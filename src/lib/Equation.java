package lib;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Equation {
  private Double number;
  private Operators op;
  private List<Equation> operands;

  public Equation(Operators op, List<Equation> operands) {
    this.op = op;
    this.operands = operands;
  }

  public Equation(Double number) {
    this.number = number;
  }

  public static Equation parseEquation(String s) {
    return EquationReader.doYourJob(s, null, null);
  }

  public Double solve() {
    if (this.number == null)
      return op.getInstance().doOperation(operands);
    return number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Equation equation = (Equation) o;
    return Objects.equals(number, equation.number) && Objects.equals(op, equation.op) && Objects.equals(operands, equation.operands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, op, operands);
  }

  @Override
  public String toString() {
    if (number != null) {
      return number.toString();
    }
    StringBuilder result = new StringBuilder();
    for (Equation o1 : operands) {
      result.append(o1.toString()).append(op.getSymbol());
    }
    return "(" + result.substring(0, result.length() - 1) + ")";
  }
}
