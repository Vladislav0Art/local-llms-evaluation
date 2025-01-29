package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public List<Token> getTestData() {
        return Arrays.asList(
                new Token(TokenType.STRING_LITERAL, "5"),
                new Token(TokenType.BINARY_OPERATOR, "+"),
                new Token(TokenType.LIT_NUMBER, "3")
        );
    }

    public ExpressionConfiguration createExpressionConfiguration() {
        return new ExpressionConfiguration();
    }

}