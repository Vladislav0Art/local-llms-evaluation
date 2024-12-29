package com.ezylang.evalex.parser;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doReturn;
import static org.junit.Assert.assertEquals;

public class GeneratedParseStringLiteral_Simple {

    public Tokenizer tokenizer = new Tokenizer("1 2 + 3", ExpressionConfiguration.empty());
    public ExpressionConfiguration configuration = new ExpressionConfiguration();
    public List<Token> tokens = new ArrayList<>();

    @Test
    public void parseStringLiteral_Simple() {
        when(tokenizer.parseStringLiteral()).thenReturn(new Token("expression_string", Type.STRING, Type.STRING));
        assertEquals("expression_string", tokens.get(0).value);
        assertEquals(Type.STRING, tokens.get(0).type);
        assertEquals(Type.STRING, tokens.get(1).type);

        verify(tokenizer).parseStringLiteral();
    }

}