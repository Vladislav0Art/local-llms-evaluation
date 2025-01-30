package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.mockito.Mockito;

public class GeneratedParse\

IsNumberTest {

    @Test
    public void parse\IsNumberTest() {
        OperatorDictionaryIfc operatorDictionary = mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = mock(FunctionDictionaryIfc.class);

        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(operatorDictionary);
        when(configuration.getFunctionDictionary()).thenReturn(functionDictionary);

        Tokenizer tokenizer = new Tokenizer("123", configuration);
        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertEquals(1, tokens.size());
        assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());
    }

}