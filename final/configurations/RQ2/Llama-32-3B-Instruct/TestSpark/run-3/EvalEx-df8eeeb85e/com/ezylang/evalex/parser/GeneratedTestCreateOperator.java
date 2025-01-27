package com.ezylang.evalex.parser;

public class GeneratedTestCreateOperator {

    @Test
    public void testCreateOperator() {
        int value = 1;
        TokenType type = TokenType.ADDITION;
        Token token = TokenFactory.createOperator(value, type);
        assertEquals(token.getClass(), Operator.class);
        assertTrue(token instanceof Token);
    }

}