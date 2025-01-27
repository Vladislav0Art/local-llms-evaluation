package com.ezylang.evalex.parser;

public class GeneratedParse_FunctionCall_ReturnsFunctionAndArgumentTokens {

    @Test
    public void parse_FunctionCall_ReturnsFunctionAndArgumentTokens() throws ParseException {
        String expressionString = "sin(1)";
        Tokenizer tokenizer = new Tokenizer(expressionString, new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        assertEquals(new ArrayList<>(Arrays.asList(Token.Function("sin"), Token.Number(1))), tokens);
    }

}