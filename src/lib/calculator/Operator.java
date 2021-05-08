package lib.calculator;

import java.util.List;

public interface Operator {
  Double doOperation(List<Equation> operands);
}
