package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseOperatorTokensTest {

    @Test
    public void parseOperatorTokensTest() throws ParseException {
        OperatorIfc operatorMock = Mockito.mock(OperatorIfc.class);
        Mockito.when(operatorMock.getOperator()).thenReturn("+");
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(configuration.getOperator("+")).thenReturn(operatorMock);
        String expressionString = "123+456";
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(TokenType.NUMBER, tokens.get(0).getType());
        assertEquals(TokenType.OPERATOR, tokens.get(1).getType());
        assertEquals(TokenType.NUMBER, tokens.get(2).getType());
    }

}