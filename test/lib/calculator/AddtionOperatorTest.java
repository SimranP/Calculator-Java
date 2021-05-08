package lib.calculator;

import lib.calculator.AdditionOperator;
import lib.calculator.Equation;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddtionOperatorTest {
  private final AdditionOperator instance = AdditionOperator.getInstance();

  @Test
  void shouldAddTwoNumbers() {
    Double result = instance.doOperation(asList(new Equation(23.0), new Equation(23.0)));
    assertEquals(result, 46.0);
  }

  @Test
  void shouldAddThreeNumbers() {
    Double result = instance.doOperation(asList(
      new Equation(23.0),
      new Equation(23.0),
      new Equation(56.2)
      )
    );
    assertEquals(result, 102.2);
  }
}
