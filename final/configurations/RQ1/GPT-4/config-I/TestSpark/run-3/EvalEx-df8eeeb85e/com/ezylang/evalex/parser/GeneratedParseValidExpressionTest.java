package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);

        String validExpression = "3+3";
        Tokenizer tokenizer = new Tokenizer(validExpression, config);
        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertEquals(3, tokens.size());
        assertEquals(NUMBER_LITERAL, tokens.get(0).getType());
        assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        assertEquals(NUMBER_LITERAL, tokens.get(2).getType());
    }

}