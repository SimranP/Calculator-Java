package lib.calculator;

import lib.calculator.Equation;
import lib.calculator.MultiplicationOperator;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationOperatorTest {
    private final MultiplicationOperator instance = MultiplicationOperator.getInstance();

    @Test
    void shouldAddTwoNumbers() {
      Double result = instance.doOperation(asList(new Equation(23.0), new Equation(23.0)));
      assertEquals(result, 529.0);
    }

    @Test
    void shouldAddThreeNumbers() {
      Double result = instance.doOperation(asList(
        new Equation(23.0),
        new Equation(23.0),
        new Equation(56.2)
        )
      );
      assertEquals(result, 29729.800000000003);
    }
}
