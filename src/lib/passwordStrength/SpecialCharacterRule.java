package lib.passwordStrength;

import java.util.regex.Pattern;

public class SpecialCharacterRule implements Rule {
  private final int min;
  private final int max;

  public SpecialCharacterRule(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public boolean matches(String password) {
    Pattern regex = Pattern.compile("[!@#$%^&*()_+{}:;,.<>/?~`]");
    long count = regex.matcher(password).results().count();
    return count >= min && count <= max;
  }
}
