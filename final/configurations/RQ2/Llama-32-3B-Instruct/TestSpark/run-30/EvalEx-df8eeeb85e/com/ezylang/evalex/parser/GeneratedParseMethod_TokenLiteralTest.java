package com.ezylang.evalex.parser;

public class GeneratedParseMethod_TokenLiteralTest {

    @Test
    public void parseMethod_TokenLiteralTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1 + 2 * 3", ExpressionConfiguration.valid());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.stream()
                .anyMatch(token -> token.getType() == LITERAL));
    }

}