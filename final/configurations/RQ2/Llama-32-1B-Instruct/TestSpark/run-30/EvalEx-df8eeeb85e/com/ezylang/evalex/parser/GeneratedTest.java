package com.ezylang.evalex.parser;

public class GeneratedTest {

    public static void tokenTypeCheck(String type, Token token) {
        if (type.equals(TokenType.IDENTIFIER)) {
            Assert.assertNotNull(token);
        } else if (type.equals(TokenType.LITERAL_NUMBER)) {
            Assert.assertNotNull(token);
        }
    }

    @Test
    public void testParseStringLiteral() throws ParseException {
        String expression = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.IDENTIFIER, tokens.get(0));
        tokenTypeCheck(TokenType.LITERAL_NUMBER, tokens.get(1));

        Assert.assertFalse(tokens.isEmpty());
    }

    @Test
    public void testParseStringLiteral() throws ParseException {
        String expression = "a + b";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.IDENTIFIER, tokens.get(0));
        tokenTypeCheck(TokenType.LITERAL_NUMBER, tokens.get(1));

        Assert.assertFalse(tokens.isEmpty());
    }

    @Test
    public void testParseNumberLiteral() throws ParseException {
        String expression = "123";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.LITERAL_NUMBER, tokens.get(0));
    }

    @Test
    public void testParseIdentifierLiteral() throws ParseException {
        String expression = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.IDENTIFIER, tokens.get(0));
    }

    @Test
    public void testParseVariableIdentifierLiteral() throws ParseException {
        String expression = "a";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.IDENTIFIER, tokens.get(0));
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

    @Test
    public void testParseFunctionLiteral() throws ParseException {
        String expression = "sqrt";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> tokens = tokenizer.parse();

        tokenTypeCheck(TokenType.IDENTIFIER, tokens.get(0));
    }

}