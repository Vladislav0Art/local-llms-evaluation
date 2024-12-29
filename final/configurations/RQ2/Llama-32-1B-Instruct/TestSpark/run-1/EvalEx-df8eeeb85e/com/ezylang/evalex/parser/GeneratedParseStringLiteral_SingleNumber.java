package com.ezylang.evalex.parser;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.doReturn;
import static org.junit.Assert.assertEquals;

public class GeneratedParseStringLiteral_SingleNumber {

    public Tokenizer tokenizer = new Tokenizer("1 2 + 3", ExpressionConfiguration.empty());
    public ExpressionConfiguration configuration = new ExpressionConfiguration();
    public List<Token> tokens = new ArrayList<>();

    @Test
    public void parseStringLiteral_SingleNumber() {
        when(tokenizer.parseStringLiteral()).thenReturn(new Token("expression_string", Type.NUMBER, Type.NUMBER));
        assertEquals("expression_string", tokens.get(0).value);
        assertEquals(Type.NUMBER, tokens.get(0).type);
        assertEquals(Type.NUMBER, tokens.get(1).type);

        verify(tokenizer).parseStringLiteral();
    }

}