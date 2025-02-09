package com.ezylang.evalex.parser;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import org.junit.Test;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseWithValidFunctionTest {

    @Test
    public void parseWithValidFunctionTest() {
        FunctionIfc function = Mockito.mock(FunctionIfc.class);
        FunctionDictionaryIfc dictionary = Mockito.mock(FunctionDictionaryIfc.class);
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        when(dictionary.getFunction("SUM")).thenReturn(function);
        when(configuration.getFunctionDictionary()).thenReturn(dictionary);
        Tokenizer tokenizer = new Tokenizer("SUM", configuration);
        try {
            List<Token> tokens = tokenizer.parse();
            assertTrue(tokens.size() == 1 && tokens.get(0).getType() == Token.TokenType.FUNCTION);
        } catch (ParseException e) {
            fail("ParseException should not have been thrown for a valid function");
        }
    }

}