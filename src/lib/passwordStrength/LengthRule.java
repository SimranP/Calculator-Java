package lib.passwordStrength;

public class LengthRule implements Rule{
  private final int min;
  private final int max;

  public LengthRule(int min, int max) {
    this.min = min;
    this.max = max;
  }

  @Override
  public boolean matches(String password) {
    return password.length() >= min && password.length() <= max;
  }
}
