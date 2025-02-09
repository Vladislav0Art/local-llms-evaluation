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

public class GeneratedParseOperatorTest {

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