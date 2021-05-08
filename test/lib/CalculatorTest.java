package lib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
  Calculator cal = new Calculator();

  @Test
  void shouldBeAbleToAddPositiveNumbers() {
    assertEquals(cal.execute("2+2+2+3"), 6);
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

  @Test
  void shouldBeAbleToHandleDecimals() {
    assertEquals(cal.execute("2+2*2/2-2"), 2);
  }

  @Test
  void shouldBeAbleToCalculatePercentage() {
    assertEquals(cal.execute("20%3"), 666.6666666666667);
  }
}

