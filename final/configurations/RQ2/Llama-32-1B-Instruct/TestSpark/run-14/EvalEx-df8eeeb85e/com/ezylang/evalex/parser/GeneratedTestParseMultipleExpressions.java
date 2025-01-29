package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseMultipleExpressions {

    @Test
    public void testParseMultipleExpressions() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionDictionaryIfc functionDictionary = new FunctionDictionaryIfc();
        OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();

        Parser parser = new Parser(expressionString, configuration);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        List<Token> expressions = tokenizers.parse();
        assertEquals(3, expressions.size());
        expectations = when(functionDictionary.createFunction("1 + 2 * 3")).thenReturn(new FunctionIfc[]{new FunctionIfc() {
            public int apply(int x) {
                return x;
            }
        }, new FunctionIfc() {
            public int apply(int x) {
                return x * 2;
            }
        }}).andThrow(ParseException.class);
        expectations = when(operatorDictionary.createOperator("+", "+")).thenReturn(new OperatorIfc[]{}).andThrow(ParseException.class);

        tokenizer.parse().stream()
                .forEach(token -> resultTokens.add(token));
        assertEquals(expressionString, resultTokens.stream().map(Token::getType).collect(Collectors.joining(", ")));
    }

}