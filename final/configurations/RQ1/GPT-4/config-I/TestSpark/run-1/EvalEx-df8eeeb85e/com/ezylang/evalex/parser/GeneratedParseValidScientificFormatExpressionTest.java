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

public class GeneratedParseValidScientificFormatExpressionTest {

    @Test
    public void parseValidScientificFormatExpressionTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);

        Mockito.when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        Mockito.when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);

        Tokenizer tokenizer = new Tokenizer("1e+10", configuration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(tokens.size(), 1);
        assertEquals(tokens.get(0).getType(), Token.TokenType.NUMBER_LITERAL);
    }

}