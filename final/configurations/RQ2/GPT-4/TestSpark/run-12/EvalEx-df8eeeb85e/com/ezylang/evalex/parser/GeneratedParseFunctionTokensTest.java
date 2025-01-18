package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFunctionTokensTest {

    @Test
    public void parseFunctionTokensTest() throws ParseException {
        FunctionIfc functionMock = Mockito.mock(FunctionIfc.class);
        Mockito.when(functionMock.getName()).thenReturn("abc");
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getFunction("abc")).thenReturn(functionMock);
        String expressionString = "abc(123)";
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(TokenType.FUNCTION, tokens.get(0).getType());
        assertEquals(TokenType.OPEN_PAREN, tokens.get(1).getType());
        assertEquals(TokenType.CLOSE_PAREN, tokens.get(2).getType());
    }

}