package lib.passwordStrength;

public interface Rule {
  public boolean matches(String password);
}
