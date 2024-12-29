package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTokenizerParseToken_InvalidExpression {

    @Test
    public void tokenizerParseToken_InvalidExpression() {
        String expressionString = "1 +";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        when(configuration.getFunctionDict()).thenReturn(new FunctionDictionaryIfc());
        when(configuration.getOperatorDict()).thenReturn(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(1, tokens.size());
        assertTrue(tokens.contains(Token.valueOf("1")));
        assertTrue(tokens.contains(Token.valueOf("+")));
    }

}