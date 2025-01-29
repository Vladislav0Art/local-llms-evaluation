package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedTestParseMultipleTokens {

    public Tokenizer(String expressionString, FunctionDictionaryIfc functionDictionaryIfc) {
        this.expressionString = expressionString;
        this.functionDictionaryIfc = functionDictionaryIfc;
    }

    public List<Token> parse() throws ParseException {
        return parseStringLiteral();
    }

    public Token parseStringLiteral() throws ParseException {
        String literal = expressionString.substring(0, expressionString.indexOf(' '));
        return new Token(literal, TokenType.SPLITTER);
    }
}

class TokenizerTest {

    private FunctionDictionaryIfc functionDictionaryIfc;
    private OperatorDictionaryIfc operatorDictionaryIfc;

    public TokenizerTest(FunctionDictionaryIfc functionDictionaryIfc) {
        this.functionDictionaryIfc = functionDictionaryIfc;
        this.operatorDictionaryIfc = new OperatorDictionaryIfc();
    }

    @Test
    public void testParseMultipleTokens() throws ParseException {
        List<Token> expected = new ArrayList<>();
        Token token1 = new Token("s", TokenType.SPLITTER);
        expected.add(token1);
        Token token2 = new Token("*", TokenType.FROM);
        expected.add(token2);
        Token token3 = new Token("2", TokenType.NUMBER);
        expected.add(token3);
        Token token4 = new Token("+", TokenType.ADD);
        expected.add(token4);
        Token token5 = new Token("5", TokenType.NUMBER);
        expected.add(token5);
        result = parseStringLiteral();
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).toString(), result.get(i).toString());
        }
    }

}

class ExpressionConfiguration {

    public FunctionDictionaryIfc functionDictionaryIfc;

    public ExpressionConfiguration() {
        this.functionDictionaryIfc = new FunctionDictionaryIfc();
    }

}