package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration mockConfiguration = Mockito.mock(ExpressionConfiguration.class);
        Mockito.when(mockConfiguration.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("1/2(-4)", mockConfiguration);
        List<Token> expected = Arrays.asList(
                new Token(0, "1", Token.TokenType.NUMBER_LITERAL),
                new Token(1, "/", Token.TokenType.INFIX_OPERATOR),
                new Token(2, "2", Token.TokenType.NUMBER_LITERAL),
                new Token(2, "*", Token.TokenType.INFIX_OPERATOR),
                new Token(3, "(", Token.TokenType.BRACE_OPEN),
                new Token(4, "-", Token.TokenType.PREFIX_OPERATOR),
                new Token(5, "4", Token.TokenType.NUMBER_LITERAL),
                new Token(6, ")", Token.TokenType.BRACE_CLOSE)
        );
        Assert.assertEquals(expected, tokenizer.parse());
    }

}