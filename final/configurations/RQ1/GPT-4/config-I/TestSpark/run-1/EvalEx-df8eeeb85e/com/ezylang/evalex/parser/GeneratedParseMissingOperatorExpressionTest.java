package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseMissingOperatorExpressionTest {

    @Test
    public void parseMissingOperatorExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);

        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        Mockito.when(operatorDictionary.hasInfixOperator("*")).thenReturn(true);
        Mockito.when(operatorDictionary.getInfixOperator("*")).thenReturn(operator);
        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        Mockito.when(configuration.isImplicitMultiplicationAllowed()).thenReturn(true);

        Tokenizer tokenizer = new Tokenizer("3(2 + 2)", configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(tokens.size(), 5);
        assertEquals(tokens.get(0).getType(), Token.TokenType.NUMBER_LITERAL);
        assertEquals(tokens.get(1).getType(), Token.TokenType.INFIX_OPERATOR);
        assertEquals(tokens.get(2).getType(), Token.TokenType.BRACE_OPEN);
    }

}