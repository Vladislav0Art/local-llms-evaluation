package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseFunctionIdentifierTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseFunctionIdentifierTest() {
        when(expressionString()).thenReturn("myFunc");
        List<Token> tokens = tokenizer.parse();
        assertEquals(4, tokens.size());
        assertEquals(new FunctionIdentifierToken("myFunc"), tokens.get(0));
    }

}