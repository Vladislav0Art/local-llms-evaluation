package com.ezylang.evalex.parser;

public class GeneratedTest {

    @Test
    public void testCreateOperator() {
        int value = 1;
        TokenType type = TokenType.ADDITION;
        Token token = TokenFactory.createOperator(value, type);
        assertEquals(token.getClass(), Operator.class);
        assertTrue(token instanceof Token);
    }

    @Test
    public void testCreateLiteral() {
        int value = 2;
        TokenType type = TokenType.NUMBER;
        Token token = TokenFactory.createLiteral(value, type);
        assertEquals(token.getClass(), Literal.class);
        assertTrue(token instanceof Token);
    }

}