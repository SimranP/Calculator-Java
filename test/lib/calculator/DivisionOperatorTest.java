package lib.calculator;

import lib.calculator.DivisionOperator;
import lib.calculator.Equation;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionOperatorTest {
    private final DivisionOperator instance = DivisionOperator.getInstance();

    @Test
    void shouldAddTwoNumbers() {
      Double result = instance.doOperation(asList(new Equation(4.0), new Equation(2.0)));
      assertEquals(result, 2.0);
    }

    @Test
    void shouldAddThreeNumbers() {
      Double result = instance.doOperation(asList(
        new Equation(24.0),
        new Equation(12.0),
        new Equation(2.0)
        )
      );
      assertEquals(result, 1.0);
    }
}
