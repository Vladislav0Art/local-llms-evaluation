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

public class GeneratedParseFunctionTest {

    @Test
    public void parseFunctionTest() throws ParseException {
        // Given
        String expression = "SIN(90)";
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.getFunction("SIN")).thenReturn(Mockito.mock(FunctionIfc.class));
        Tokenizer tokenizer = new Tokenizer(expression, config);

        // When
        List<Token> tokens = tokenizer.parse();

        // Then
        assertEquals(4, tokens.size());
        assertEquals(TokenType.FUNCTION, tokens.get(0).getType());
        assertEquals("SIN", tokens.get(0).getText());
    }

}