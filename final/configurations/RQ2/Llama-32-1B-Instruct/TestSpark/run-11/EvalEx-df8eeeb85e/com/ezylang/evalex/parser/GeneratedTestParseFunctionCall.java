package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

public class GeneratedTestParseFunctionCall {

    @Test
    public void testParseFunctionCall() {
        String expressionString = "a.b";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(2, tokens.size());
        assertEquals(ExpressionType.FUNCTION_CALL_TOKEN_TYPE, tokens.get(0).getType());
    }

}