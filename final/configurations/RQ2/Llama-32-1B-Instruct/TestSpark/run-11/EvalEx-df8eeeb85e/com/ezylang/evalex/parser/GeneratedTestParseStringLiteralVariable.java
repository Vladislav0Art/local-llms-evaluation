package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseStringLiteralVariable {

    @Test
    public void testParseStringLiteralVariable() {
        String expressionString = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
        assertEquals(ExpressionType.VARIABLE_TOKEN_TYPE, tokens.get(0).getType());
    }

}