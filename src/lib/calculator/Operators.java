package lib.calculator;

public enum Operators {
  Add("+", AdditionOperator.getInstance(), "[+]"),
  Sub("-", SubtractionOperator.getInstance(), "[-]"),
  Mul("*", MultiplicationOperator.getInstance(), "[*]"),
  Div("/", DivisionOperator.getInstance(), "[/]");

  public String getSymbol() {
    return symbol;
  }

  public Operator getInstance() {
    return instance;
  }

  private final String symbol;
  private final Operator instance;
  private final String regex;

  Operators(String symbol, Operator instance, String regex) {
    this.symbol = symbol;
    this.instance = instance;
    this.regex = regex;
  }

  public String[] split(String s){
    return s.split(regex);
  }
}
