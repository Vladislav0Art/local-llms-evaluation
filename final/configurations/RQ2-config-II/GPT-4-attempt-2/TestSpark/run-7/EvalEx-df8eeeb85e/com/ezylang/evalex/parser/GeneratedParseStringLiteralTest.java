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

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        // Given
        String expression = "\"Test\"";
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expression, config);

        // When
        Token token = tokenizer.parseStringLiteral();

        // Then
        assertEquals(TokenType.STRING_LITERAL, token.getType());
        assertEquals("Test", token.getText());
    }

}