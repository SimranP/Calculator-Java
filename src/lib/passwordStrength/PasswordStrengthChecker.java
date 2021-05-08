package lib.passwordStrength;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class PasswordStrengthChecker {

  public Stream<String> getStrength(String pass) {
    Map<String, List<Rule>> map = new HashMap<>();
    LengthRule lengthRule = new LengthRule(5, 8);
    SpecialCharacterRule specialCharacterRule = new SpecialCharacterRule(1, 8);
    NumberRule numberRule = new NumberRule(1, 8);
    AlphaValueRule alphaValueRule = new AlphaValueRule(1, 8);
    AlphaNumericRule alphaNumericRule = new AlphaNumericRule(1, 8);
    map.put("Strong", asList(lengthRule, alphaValueRule, numberRule, specialCharacterRule));
    map.put("Medium", asList(lengthRule, alphaValueRule, numberRule));
    map.put("Weak", asList(lengthRule, alphaNumericRule));

    return map.keySet().stream().filter(s-> new RulesMatcher(map.get(s)).check(pass, s));
  }
}

