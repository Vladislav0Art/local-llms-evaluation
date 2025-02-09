package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedParseNumberLiteralTest {

    @Test
    public void parseNumberLiteralTest() throws ParseException {
        // Given
        String expression = "5";
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expression, config);

        // When
        List<Token> tokens = tokenizer.parse();

        // Then
        assertEquals(1, tokens.size());
        assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());
        assertEquals("5", tokens.get(0).getText());
    }

}