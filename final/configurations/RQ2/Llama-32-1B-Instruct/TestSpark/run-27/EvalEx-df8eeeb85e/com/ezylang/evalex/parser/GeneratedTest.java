package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

public class GeneratedTest {

    public static void main(String[] args) {
        new TokenizerTest();
    }

    @Test
    public void tokenizers() throws ParseException]

    {
        // Arrange
        String expressionString = "123";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // Act & Assert
        Tokenizer tokenizer = new TokenizerImpl(tokenizers[0]);
        tokenizer.newTokenizer(expressionString, configuration);
    }

    @Test
    public void tokenizers() throws ParseException]

    {
        // Arrange
        String expressionString = "123";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // Act & Assert
        FunctionIfc function = tokenizer.parse().getFunctions()[0];
        assertEquals(123, function.value());
    }

    @Test
    public void tokenizers() throws ParseException]

    {
        // Arrange
        String expressionString = "123";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // Act & Assert
        OperatorIfc operator = tokenizer.parse().getOperators()[0];
        assertEquals(OperatorIfc.PLUS, operator);
    }

    @Test
    public void tokenizers() throws ParseException]

    {
        // Arrange
        String expressionString = "123";
        ExpressionConfiguration configuration = new ExpressionConfiguration();

        // Act & Assert
        List<Token> tokens = tokenizer.parse().getTokens();
        assertEquals(1, tokens.size());
    }

}