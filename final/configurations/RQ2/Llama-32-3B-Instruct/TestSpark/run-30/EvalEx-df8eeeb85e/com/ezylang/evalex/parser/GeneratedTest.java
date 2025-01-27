package com.ezylang.evalex.parser;

public class GeneratedTest {

    @Test
    public void constructorTest_ExpressionEmpty() {
        assertThrows(ParseException.class, () -> new Tokenizer("", ExpressionConfiguration.empty()));
    }

    @Test
    public void constructorTest_ExpressionValid() {
        String expressionString = "1 + 2 * 3";
        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.valid());
        assertNotNull(tokenizer);
        assertEquals(1, tokenizer.parse().size());
    }

    @Test
    public void parseMethod_TokenLiteralTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1 + 2 * 3", ExpressionConfiguration.valid());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.stream()
                .anyMatch(token -> token.getType() == LITERAL));
    }

    @Test
    public void parseMethod_TokenOperatorTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1 + 2 * 3", ExpressionConfiguration.valid());
        List<Token> tokens = tokenizer.parse();
        assertTrue(tokens.stream()
                .anyMatch(token -> token.getType() == PLUS));
    }

    @Test
    public void parseMethod_TokenFunctionTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("abs(1)", ExpressionConfiguration.valid());
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
    }

    @Test
    public void parseStringLiteral_TokenLiteralTest() throws ParseException {
        String expressionString = "hello";
        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.valid());
        Token token = tokenizer.parseStringLiteral();
        assertEquals(LITERAL, token.getType());
        assertNotNull(token.getValue());
    }

    @Test
    public void parseStringLiteral_TokenNotLiteralTest() throws ParseException {
        String expressionString = "hello";
        Tokenizer tokenizer = new Tokenizer(expressionString, ExpressionConfiguration.valid());
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }

}