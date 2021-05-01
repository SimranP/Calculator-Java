package lib;

import java.util.*;

public class EquationReader {
  public static Equation doYourJob(String s) {
    String target = s.trim();
    Equation masterEquation = null;
    String number = "";
    ArrayList<Equation> numbers = new ArrayList<>();
    Operator op = null;
    for (int i = 0; i < target.length(); i++) {
      if (isANumber(target.charAt(i)) || isAOperator(target.charAt(i))) {
        if (isANumber(target.charAt(i))) {
          number += target.charAt(i);
          if (i == target.length() - 1) {
            if (op == null)
              masterEquation = new Equation(Integer.parseInt(number));
            else masterEquation = new Equation(op, numbers.get(0), new Equation(Integer.parseInt(number)));
          }
        } else if (isAOperator(target.charAt(i))) {
          op = getOperator(target.charAt(i));
          numbers.add(new Equation(Integer.parseInt(number)));
          if (numbers.size() == 2) {
            masterEquation = new Equation(op, numbers.get(0), numbers.get(1));
            numbers = new ArrayList<>();
            numbers.add(masterEquation);
          }
          number = "";
        }
      } else throw new RuntimeException("Unacceptable character -> " + target.charAt(i));
    }
    return masterEquation;
  }

  private static Operator getOperator(char charAt) {
    HashMap<String, Operator> operatorMap = new HashMap<>();
    operatorMap.put("+", AdditionOperator.getInstance());
    operatorMap.put("-", SubtractionOperator.getInstance());
    operatorMap.put("*", MultiplicationOperator.getInstance());
    operatorMap.put("/", DivisionOperator.getInstance());

    return operatorMap.get(String.valueOf(charAt));
  }

  private static boolean isANumber(char charAt) {
    return Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0').contains(charAt);
  }

  private static boolean isAOperator(char charAt) {
    return Set.of('+', '-', '*', '/').contains(charAt);
  }
}
