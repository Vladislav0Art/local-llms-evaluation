package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTokenizer_parse_stringLiteral_end_quote {

    @Test
    public void tokenizer_parse_stringLiteral_end_quote() {
        // Arrange
        String expressionString = "\"Hello World\"";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Act
        Token token = tokenizer.parseStringLiteral();

        // Assert
        assertEquals(TokenType.STRING_LITERAL_END, token.getType());
    }

}