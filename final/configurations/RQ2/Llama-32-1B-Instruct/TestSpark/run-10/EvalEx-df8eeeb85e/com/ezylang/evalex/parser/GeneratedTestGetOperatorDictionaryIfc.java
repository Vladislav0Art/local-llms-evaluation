package com.ezylang.evalex.parser;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedTestGetOperatorDictionaryIfc {

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
    public void testGetOperatorDictionaryIfc() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("s+2", null);
        List<Token> expected = new ArrayList<>();
        expected.add(new Token("+", TokenType.ADD));
        assertEquals(expected.size(), tokenizer.getOperatorDictionaryIfc().getOperators().size());
    }

}

class ExpressionConfiguration {

    public FunctionDictionaryIfc getFunctionDictionaryIfc() {
        return functionDictionaryIfc;
    }

    public OperatorDictionaryIfc getOperatorDictionaryIfc() {
        return operatorDictionaryIfc;
    }

}