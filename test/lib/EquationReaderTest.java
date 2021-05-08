package lib;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquationReaderTest {
  @Test
  void shouldReturnEquationForDecimals() {
    Equation actualEquation = EquationReader.doYourJob("23.5+22+2",  null, null);
    Equation expectedEquation = new Equation(Operators.Add, asList(new Equation(23.5), new Equation(22.0), new Equation(2.0)));

    assertEquals(actualEquation, expectedEquation);
  }

  @Test
  void shouldReturnEquationForDecimals1() {
    Equation actualEquation = EquationReader.doYourJob("23.5+23-22*2+2",  null, null);
    Equation expectedEquation = new Equation(Operators.Add, asList(new Equation(23.5), new Equation(22.0), new Equation(2.0)));
    assertEquals(actualEquation, expectedEquation);
  }
}
