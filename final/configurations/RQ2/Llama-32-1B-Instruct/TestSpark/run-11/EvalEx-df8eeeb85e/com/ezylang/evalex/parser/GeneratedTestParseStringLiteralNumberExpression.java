package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseStringLiteralNumberExpression {

    @Test
    public void testParseStringLiteralNumberExpression() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
        assertEquals(ExpressionType.NUMBER_TOKEN_TYPE, tokens.get(0).getType());
    }

}