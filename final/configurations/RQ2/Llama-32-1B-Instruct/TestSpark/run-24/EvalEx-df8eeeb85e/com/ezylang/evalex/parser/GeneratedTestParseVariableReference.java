package com.ezylang.evalex.parser;

public class GeneratedTestParseVariableReference {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseVariableReference() {
        String expressionString = "x";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new VariableReferenceToken("x"));
        assertEquals(expectedTokens, tokenizer.parseVariableReference(expressionString));
    }

}