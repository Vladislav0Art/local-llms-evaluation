package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[Tokenizer][Scenario]

Test_parseLiteralExpression {

    @Test
    public void [Tokenizer][Scenario]Test_parseLiteralExpression() {
        String expression = "1 + 2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenTypeNUMBER, 1, null));
        expectedTokens.add(new Token(TokenTypePLUS, 2, null));
        tokenizer.parse().forEach(token -> {
            if (token.getType() == TokenType.NUMBER) {
                assert token.equals(expectedTokens.get(0));
            }
            if (token.getType() == TokenType.PLUS) {
                assert token.equals(expectedTokens.get(1));
            }
        });

        tokenizer.clearTokens();
    }

}