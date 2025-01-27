package com.ezylang.evalex.parser;

public class GeneratedTestCreateLiteral {

    @Test
    public void testCreateLiteral() {
        int value = 2;
        TokenType type = TokenType.NUMBER;
        Token token = TokenFactory.createLiteral(value, type);
        assertEquals(token.getClass(), Literal.class);
        assertTrue(token instanceof Token);
    }

}