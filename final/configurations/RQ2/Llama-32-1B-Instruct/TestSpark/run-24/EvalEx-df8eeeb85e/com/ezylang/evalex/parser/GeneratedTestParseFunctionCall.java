package com.ezylang.evalex.parser;

public class GeneratedTestParseFunctionCall {

    private Tokenizer tokenizer;

    @Before
    public void setup() {
        String expressionString = "1 + 2";
        ExpressionConfiguration configuration = new DefaultExpressionConfiguration();
        tokenizer = new Tokenizer(expressionString, configuration);
    }

    @Test
    public void testParseFunctionCall() {
        String expressionString = "F(x)";
        List<Token> expectedTokens = new ArrayList<>();
        expectedTokens.add(new FunctionCallToken(F));
        expectedTokens.add(new VariableReferenceToken("x"));
        assertEquals(expectedTokens, tokenizer.parseFunctionCall(expressionString));
    }

}