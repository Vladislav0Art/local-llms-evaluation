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

public class GeneratedParseValidExpressionTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void parseValidExpressionTest() throws ParseException {
        String expression = "2+2";
        ExpressionConfiguration expressionConfiguration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, expressionConfiguration);
        List<Token> tokens = tokenizer.parse();

        assertEquals(3, tokens.size());
        assertEquals("2", tokens.get(0).getValue());
        assertEquals("+", tokens.get(1).getValue());
        assertEquals("2", tokens.get(2).getValue());
    }

}