package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseInvalidExpression {

    @Test
    public void testParseInvalidExpression() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDictionary = new FunctionDictionaryIfc();

        Parser parser = new Parser("1 + 2 *", configuration);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        tokenizers.parse().stream()
                .forEach(token -> resultTokens.add(token));
        assertEquals(null, resultTokens.stream().map(Token::getType).collect(Collectors.joining(", ")));
    }

}