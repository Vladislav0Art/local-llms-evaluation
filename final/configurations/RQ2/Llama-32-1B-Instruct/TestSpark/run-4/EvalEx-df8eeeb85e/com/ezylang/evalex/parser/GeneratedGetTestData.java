package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.jupiter.api.Test;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import java.util.ArrayList;

public class GeneratedGetTestData {

    public ExpressionConfiguration createExpressionConfiguration() {
        return new ExpressionConfiguration();
    }

    @Test
    public void getTestData() {
        return Arrays.asList(
                new Token("5", TokenType.NUMBER),
                new Token("+", TokenType.BINARY_OPERATOR),
                new Token("3", TokenType.NUMBER)
        );
    }

}