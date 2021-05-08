package lib.passwordStrength;

import java.util.List;

public class RulesMatcher {
  private final List<Rule> rules;

  public RulesMatcher(List<Rule> rules) {
    this.rules = rules;
  }

  public boolean check(String pass, String s){
    return rules.stream().allMatch(rule -> rule.matches(pass));
  }
}
