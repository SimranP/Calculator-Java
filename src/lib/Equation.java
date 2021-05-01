package lib;

import java.util.Objects;

public class Equation {
  private Integer number;
  private Operator op;
  private Equation op1;
  private Equation op2;

  public Equation(Operator op, Equation op1, Equation op2) {
    this.op = op;
    this.op1 = op1;
    this.op2 = op2;
  }

  public Equation(Integer number) {
    this.number = number;
  }

  public static Equation parseEquation(String s) {
    return EquationReader.doYourJob(s);
  }

  public Integer solve() {
    if (this.number == null)
      return op.doOperation(op1, op2);
    return number;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Equation equation = (Equation) o;
    return Objects.equals(number, equation.number) && Objects.equals(op, equation.op) && Objects.equals(op1, equation.op1) && Objects.equals(op2, equation.op2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, op, op1, op2);
  }

  @Override
  public String toString() {
    return "Equation{" +
      "number=" + number +
      ", op=" + op +
      ", op1=" + op1 +
      ", op2=" + op2 +
      '}';
  }
}
