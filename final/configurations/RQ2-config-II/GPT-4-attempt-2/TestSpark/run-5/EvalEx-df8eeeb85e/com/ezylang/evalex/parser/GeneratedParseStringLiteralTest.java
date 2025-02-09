package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseStringLiteralTest {

    @Test
    public void parseStringLiteralTest() throws ParseException {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        ExpressionConfiguration configuration = new ExpressionConfiguration(functionDictionary, operatorDictionary);
        Tokenizer tokenizer = new Tokenizer("\"Hello\"", configuration);
        Token token = tokenizer.parseStringLiteral();
        assertEquals("Hello", token.getSurface());
    }

}