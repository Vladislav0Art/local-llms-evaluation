package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseStringLiteralEmptyExpression {

    @Test
    public void testParseStringLiteralEmptyExpression() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(0, tokens.size());
    }

}