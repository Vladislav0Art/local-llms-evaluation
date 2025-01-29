package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.jupiter.api.Test;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import java.util.ArrayList;

public class GeneratedParseOperatorExpressionStatementTest {

    public ExpressionConfiguration createExpressionConfiguration() {
        return new ExpressionConfiguration();
    }

    @Test
    public void parseOperatorExpressionStatementTest() {
        String expressionString = "5 + 3";
        ExpressionConfiguration configuration = createExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().get(0).getTokenTokens();
        assertEquals(TokenType.OPERATOR, getMethodUnderTest("parseOperator")[0]);
    }

    private List<Token> getTestData() {
        return Arrays.asList(
                new Token("5", TokenType.NUMBER),
                new Token("+", TokenType.BINARY_OPERATOR),
                new Token("3", TokenType.NUMBER)
        );
    }

}