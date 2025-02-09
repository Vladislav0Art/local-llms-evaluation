package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseEmptyExpressionTest {

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("", config);

        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertTrue(tokens.isEmpty());
    }

}