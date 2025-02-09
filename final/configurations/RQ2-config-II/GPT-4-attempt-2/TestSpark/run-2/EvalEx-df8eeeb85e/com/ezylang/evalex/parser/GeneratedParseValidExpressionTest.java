package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration(Mockito.mock(FunctionIfc.class), Mockito.mock(OperatorIfc.class));
        Tokenizer tokenizer = new Tokenizer("3+5", config);

        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertFalse(tokens.isEmpty());
        assertEquals(3, tokens.size());
    }

}