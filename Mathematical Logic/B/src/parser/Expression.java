package parser;

public interface Expression {
    String toStringPrefix();

    String toStringInfix();

    boolean equals(Expression expression);
}
