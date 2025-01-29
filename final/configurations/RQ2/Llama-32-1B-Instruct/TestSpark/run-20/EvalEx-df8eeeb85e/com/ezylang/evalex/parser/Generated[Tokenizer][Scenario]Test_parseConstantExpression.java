package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Generated[Tokenizer][Scenario]

Test_parseConstantExpression {

    @Test
    public void [Tokenizer][Scenario]Test_parseConstantExpression() {
        String expression = "5";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc dictionaryIfc = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expression, configuration);
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new Token(TokenTypeNUMBER, 5, null));
        tokenizer.parse().forEach(token -> {
            if (token.getType() == TokenType.NUMBER) {
                assert token.equals(expectedTokens.get(0));
            }
        });

        tokenizer.clearTokens();
    }

}