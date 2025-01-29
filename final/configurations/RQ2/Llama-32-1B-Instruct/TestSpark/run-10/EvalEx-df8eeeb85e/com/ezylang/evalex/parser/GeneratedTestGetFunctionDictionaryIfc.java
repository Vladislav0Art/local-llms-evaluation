package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedTestGetFunctionDictionaryIfc {

    public FunctionDictionaryIfc getFunctionDictionaryIfc() {
        return functionDictionaryIfc;
    }

    public OperatorDictionaryIfc getOperatorDictionaryIfc() {
        return operatorDictionaryIfc;
    }
}

class TokenizerTest {

    private ExpressionConfiguration configuration;

    @Test
    public void testGetFunctionDictionaryIfc() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("s", null);
        List<Token> expected = new ArrayList<>();
        expected.add(new Token("s", TokenType.SPLITTER));
        expected.add(new Token("*", TokenType.FROM));
        expected.add(new Token("2", TokenType.NUMBER));
        expected.add(new Token("+", TokenType.ADD));
        assertEquals(expected.size(), tokenizer.getFunctionDictionaryIfc().getFunctions().size());
    }

}