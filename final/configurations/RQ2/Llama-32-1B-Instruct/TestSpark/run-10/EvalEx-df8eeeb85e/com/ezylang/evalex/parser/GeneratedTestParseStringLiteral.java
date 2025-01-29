package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedTestParseStringLiteral {

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
    public void testParseStringLiteral() throws ParseException {
        List<Token> expected = new ArrayList<>();
        Token token = new Token("s", TokenType.SPLITTER);
        result = parseStringLiteral();
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i).toString(), result.get(i).toString());
        }
    }

}