package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseVariableIdentifierTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseVariableIdentifierTest() {
        when(expressionString()).thenReturn("x");
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(new IdentifierToken("x"), tokens.get(0));
    }

}