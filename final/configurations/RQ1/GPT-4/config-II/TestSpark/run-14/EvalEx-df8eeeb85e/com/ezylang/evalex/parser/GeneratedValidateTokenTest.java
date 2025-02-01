package com.ezylang.evalex.parser;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;

import java.util.List;

public class GeneratedValidateTokenTest {

    @Test
    public void validateTokenTest() throws ParseException {
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);
        when(config.getOperatorDictionary()).thenReturn(mock(OperatorDictionaryIfc.class));
        when(config.getFunctionDictionary()).thenReturn(mock(FunctionDictionaryIfc.class));
        when(config.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("2*(2+2)*2", config);
        List<Token> tokens = tokenizer.parse();

        assertEquals(7, tokens.size());
        assertEquals(TokenType.BRACE_OPEN, tokens.get(2).getType());
        assertEquals(TokenType.INFIX_OPERATOR, tokens.get(3).getType());
        assertEquals(TokenType.BRACE_CLOSE, tokens.get(5).getType());
    }

}