package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ExpressionConfiguration configuration;

    @Mock
    private ParseException exception;

    public Tokenizer tokenizer = new Tokenizer("expression", configuration);

    @Test
    public void [parse][ReturnListOfTokens]()

    {
        List<Token> tokens = new ArrayList<>();
        tokens.add(new Token("token1"));
        when(configuration.getParseMethod()).thenReturn(tokens);
        assertEquals(tokens, tokenizer.parse());
    }

    @Test
    public void [parse][ThrowParseException]()

    {
        assertThrows(ParseException.class, () -> tokenizer.parse());
    }

    @Test
    public void [parseStringLiteral][ReturnToken]()

    {
        Token token = new Token("token1");
        when(configuration.getParseMethod()).thenReturn(token);
        assertEquals(token, tokenizer.parseStringLiteral());
    }

    @Test
    public void [parseStringLiteral][ThrowParseException]()

    {
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }

}