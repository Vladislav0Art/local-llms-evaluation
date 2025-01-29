package com.ezylang.evalex.parser;

public class GeneratedTestParseOperatorLiteral {

    public static void tokenTypeCheck(String type, Token token) {
        if (type.equals(TokenType.IDENTIFIER)) {
            Assert.assertNotNull(token);
        } else if (type.equals(TokenType.LITERAL_NUMBER)) {
            Assert.assertNotNull(token);
        }
    }

    @Test
    public void testParseOperatorLiteral() throws ParseException {
        String expression = "+";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.LITERAL_NUMBER, tokens.get(0));
    }

}