package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.jupiter.api.Test;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import java.util.ArrayList;

public class GeneratedParseOperatorExpression {

    public List<Token> getTestData() {
        return Arrays.asList(
                new Token("5", TokenType.NUMBER),
                new Token("+", TokenType.BINARY_OPERATOR),
                new Token("3", TokenType.NUMBER)
        );
    }

    public ExpressionConfiguration createExpressionConfiguration() {
        return new ExpressionConfiguration();
    }

    @Test
    public void parseOperatorExpression() {
        String expressionString = "5 + 3";
        ExpressionConfiguration configuration = createExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().get(0).getTokenTokens();
        assertEquals(OperatorIfc.OPERATOR, getMethodUnderTest("parseOperator")[0]);
    }

    public static class ExpressionConfiguration {
        public void accept(Tokenizer tokenizer) {
            // do nothing
        }
    }

    public static class Token {
        public static final TokenType STRING_LITERAL = new TokenType("string_literal");
        public static final TokenType BINARY_OPERATOR = new TokenType("binary_operator");
        public static final TokenType LIT_NUMBER = new TokenType("lit_number");
        public static final OperatorIfc OPERATOR = new OperatorIfc(OperatorIfc.OPERATOR);

        private final TokenType type;
        private final String value;

        public Token(TokenType type, String value) {
            this.type = type;
            this.value = value;
        }

        public TokenType getType() {
            return type;
        }

        public String getValue() {
            return value;
        }
    }

    @FunctionalInterface
    interface OperatorIfc {
        int getNumber();
    }

}