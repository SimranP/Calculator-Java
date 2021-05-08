package lib.passwordStrength;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class PasswordStrengthCheckerTest {
  PasswordStrengthChecker passwordStrengthChecker = new PasswordStrengthChecker();

  @Test
  void checkForStrong() {
    List<String> strength = passwordStrengthChecker.getStrength("abc$123").collect(Collectors.toList());
    assertTrue(strength.contains("Strong"));
  }

  @Test
  void checkForMedium() {
    List<String> strength = passwordStrengthChecker.getStrength("ancdg12").collect(Collectors.toList());
    assertFalse(strength.contains("Strong"));
    assertTrue(strength.contains("Medium"));
  }

  @Test
  void checkForWeak() {
    List<String> strength = passwordStrengthChecker.getStrength("abcde").collect(Collectors.toList());
    assertFalse(strength.contains("Strong"));
    assertFalse(strength.contains("Medium"));
    assertTrue(strength.contains("Weak"));
  }
}