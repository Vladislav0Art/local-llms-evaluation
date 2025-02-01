package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseWithMockValidExpressionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void parseWithMockValidExpressionTest() throws ParseException {
        OperatorDictionaryIfc operatorDictionaryIfcMock = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionIfc functionMock = Mockito.mock(FunctionIfc.class);
        OperatorIfc operatorMock = Mockito.mock(OperatorIfc.class);

        String expression = "2+2";
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        expressionConfiguration.setOperatorDictionary(operatorDictionaryIfcMock);
        expressionConfiguration.setFunctionDictionary(Mockito.mock(FunctionDictionaryIfc.class));
        Tokenizer tokenizer = new Tokenizer(expression, expressionConfiguration);

        Mockito.when(operatorDictionaryIfcMock.hasInfixOperator("+")).thenReturn(true);
        Mockito.when(operatorDictionaryIfcMock.getInfixOperator("+")).thenReturn(operatorMock);
        List<Token> tokens = tokenizer.parse();

        assertEquals(3, tokens.size());
        assertEquals("2", tokens.get(0).getValue());
        assertEquals("+", tokens.get(1).getValue());
        assertEquals("2", tokens.get(2).getValue());

        Mockito.verify(operatorDictionaryIfcMock, Mockito.times(1)).getInfixOperator("+");
    }

}