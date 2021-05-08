package lib;

import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static lib.Operators.Add;
import static lib.Operators.Div;
import static lib.Operators.Mul;
import static lib.Operators.Sub;

public class EquationReader {
  public static Equation doYourJob(String s, Integer index, Operators op) {
    if (getNumber(s) != null) {
      return index == 0 || index == 1 ?
        new Equation(op, asList(new Equation(getNumber(s)), doYourJob(s, index, null)))
        : new Equation(getNumber(s));
    }

    Operators instance = null;
    String[] split = {};
    for (Operators operators : asList(Sub, Add, Mul, Div)) {
      split = split.length > 1 ? split : operators.split(s);
      instance = instance == null ? getOperator(operators, split) : instance;
    }

    Operators finalInstance = instance;
    return new Equation(instance, Arrays.stream(split)
      .map(
        e -> getNumber(e) == null ?
          doYourJob(e, 0, finalInstance)
          : new Equation(getNumber(e))).collect(Collectors.toList())
    );
  }

  private static Double getNumber(String s) {
    try {
      return Double.parseDouble(s);
    } catch (Exception e) {
      return null;
    }
  }

  private static Operators getOperator(Operators op, String[] split) {
    if (split.length > 1)
      return op;
    return null;
  }
}
