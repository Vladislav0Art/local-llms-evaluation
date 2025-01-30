package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.NUMBER_LITERAL;
import static com.ezylang.evalex.parser.Token.TokenType.VARIABLE_OR_CONSTANT;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);

        Mockito.when(config.getOperatorDictionary()).thenReturn(operatorDictionary);
        Mockito.when(config.getFunctionDictionary()).thenReturn(functionDictionary);
        Mockito.when(config.isImplicitMultiplicationAllowed()).thenReturn(true);

        Tokenizer tokenizer = new Tokenizer("3+5", config);
        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(5, tokens.size());

        Assert.assertEquals(NUMBER_LITERAL, tokens.get(0).getType());
        Assert.assertEquals("3", tokens.get(0).getValue());

        Assert.assertEquals(VARIABLE_OR_CONSTANT, tokens.get(2).getType());
        Assert.assertEquals("+", tokens.get(2).getValue());

        Assert.assertEquals(NUMBER_LITERAL, tokens.get(4).getType());
        Assert.assertEquals("5", tokens.get(4).getValue());
    }

}