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

public class GeneratedParseAllowImplicitMultiplicationTest {

    @Test
    public void parseAllowImplicitMultiplicationTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);

        String implicitMultiplicationExpression = "3(2+2)";
        Tokenizer tokenizer = new Tokenizer(implicitMultiplicationExpression, config);
        List<Token> tokens = tokenizer.parse();

        assertNotNull(tokens);
        assertEquals(7, tokens.size());
        assertEquals(NUMBER_LITERAL, tokens.get(0).getType());
        assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        assertEquals(BRACE_OPEN, tokens.get(2).getType());
        assertEquals(NUMBER_LITERAL, tokens.get(3).getType());
        assertEquals(INFIX_OPERATOR, tokens.get(4).getType());
        assertEquals(NUMBER_LITERAL, tokens.get(5).getType());
        assertEquals(BRACE_CLOSE, tokens.get(6).getType());
    }

}