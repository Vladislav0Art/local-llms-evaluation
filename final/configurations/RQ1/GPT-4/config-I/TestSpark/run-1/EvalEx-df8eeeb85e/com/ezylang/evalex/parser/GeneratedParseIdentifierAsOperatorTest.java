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

public class GeneratedParseIdentifierAsOperatorTest {

    @Test
    public void parseIdentifierAsOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);

        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        Mockito.when(operatorDictionary.hasPrefixOperator("op")).thenReturn(true);
        Mockito.when(operatorDictionary.getPrefixOperator("op")).thenReturn(operator);

        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);

        Tokenizer tokenizer = new Tokenizer("op1", configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(tokens.size(), 1);
        assertEquals(tokens.get(0).getType(), Token.TokenType.PREFIX_OPERATOR);
    }

}