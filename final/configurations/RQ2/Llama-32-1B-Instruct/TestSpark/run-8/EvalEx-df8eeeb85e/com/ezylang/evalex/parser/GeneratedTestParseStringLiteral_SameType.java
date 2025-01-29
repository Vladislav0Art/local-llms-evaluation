package com.ezylang.evalex.parser;

import com.ezylang.evalex.functions.FunctionIfc;

public class GeneratedTestParseStringLiteral_SameType {

    public ExpressionConfiguration getExpressionConfiguration() {
        return new ExpressionConfiguration();
    }

    @Test
    public void testParseStringLiteral_SameType() {
        String expressionString = "1 + 2";
        Tokenizer tokenizer = new Tokenizer(expressionString, (ExpressionConfiguration) getExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertTokenCount(tokens);

        // Verify token type
        assertTokenType(tokenizer.parseStringLiteral(), TokenType.SQUAREBRACKET);
    }

}