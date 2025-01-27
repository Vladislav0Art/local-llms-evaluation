package com.ezylang.evalex.parser;

public class GeneratedTokenizerParseErrorCorrectly {

    @Test
    public void tokenizerParseErrorCorrectly() {
        // Arrange
        String expressionString = "a + b";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionaryIfc(new FunctionDictionaryIfc());
        configuration.setOperatorDictionaryIfc(new OperatorDictionaryIfc());

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        try {
            List<Token> tokens = tokenizer.parse();
            assert false;
        } catch (ParseException e) {
            assertEquals("Invalid expression: a + b", e.getMessage());
        }
    }

}