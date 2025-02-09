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

public class GeneratedTest {

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

    @Test
    public void parseInvalidSymbolTest() throws ParseException {
        // Given
        String expression = "#";
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer(expression, config);

        // When
        tokenizer.parse();
    }

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

    @Test
    public void parseOperatorTest() throws ParseException {
        // Given
        String expression = "1+1";
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.getOperator("+")).thenReturn(Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer(expression, config);

        // When
        List<Token> tokens = tokenizer.parse();

        // Then
        assertEquals(3, tokens.size());
        assertEquals(TokenType.OPERATOR, tokens.get(1).getType());
        assertEquals("+", tokens.get(1).getText());
    }

}