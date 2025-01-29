package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseStringLiteral_Optimized {

    public ExpressionConfiguration getExpressionConfiguration() {
        return new ExpressionConfiguration();
    }

    @Test
    public void testParseStringLiteral_Optimized() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString, (ExpressionConfiguration) getExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTokenCount(tokens);

        // Verify token type
        assertTokenType(tokenizer.parseStringLiteral(), TokenType.SQUAREBRACKET);
    }

    private void assertTokenCount(List<Token> tokens) {
        assertEquals(3, tokens.size());
    }

    private void assertTokenType(Token token) {
        switch (token.getType()) {
            case SQUAREBRACKET:
                break;
            default:
                fail("Unexpected token type: " + token.getType() + ", expected: SQUAREBRACKET");
        }
    }

}