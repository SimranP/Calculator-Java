package lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
  Calculator cal = new Calculator();
  @Test
  void shouldBeAbleToAddPositiveNumbers() {
    assertEquals(cal.execute("2+2"), 4);
    assertEquals(cal.execute("2+2+2"), 6);
  }

  @Test
  void shouldBeAbleToSubtractThreePositiveNumbers() {
    assertEquals(cal.execute("12-2-2"), 8);
  }
  @Test
  void shouldBeAbleToMultiplyThreePositiveNumbers() {
    assertEquals(cal.execute("2*2*2"), 8);
  }

  @Test
  void shouldBeAbleToDivideThreePositiveNumbers() {
    assertEquals(cal.execute("2/2"), 1);
  }
}
