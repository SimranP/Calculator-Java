package lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquationReaderTest {
  @Test
  void shouldReturnEquationForSingleDigits() {
    Equation actualEquation = EquationReader.doYourJob("2+2");
    Equation expectedEquation = new Equation(AdditionOperator.getInstance(), new Equation(2), new Equation(2));

    assertEquals(actualEquation, expectedEquation);
  }

  @Test
  void shouldReturnEquationForDoubleDigits() {
    Equation actualEquation = EquationReader.doYourJob("23+22");
    Equation expectedEquation = new Equation(AdditionOperator.getInstance(), new Equation(23), new Equation(22));

    assertEquals(actualEquation, expectedEquation);
  }

  @Test
  void shouldReturnEquationForThreeDigits() {
    Equation actualEquation = EquationReader.doYourJob("23+22+2");
    Equation first = new Equation(AdditionOperator.getInstance(), new Equation(23), new Equation(22));
    Equation expectedEquation = new Equation(AdditionOperator.getInstance(), first, new Equation(2));

    assertEquals(actualEquation, expectedEquation);
  }
}
