package lib.passwordStrength;

import java.util.regex.Pattern;

public class NumberRule implements Rule{
  private final int min;
  private final int max;

  public NumberRule(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public boolean matches(String password) {
    Pattern regex = Pattern.compile("[0-9]");
    long count = regex.matcher(password).results().count();
    return count >= min && count <= max;
  }
}
