package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseConstantLiteralTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseConstantLiteralTest() {
        when(expressionString()).thenReturn("5");
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(new ConstantLiteralToken(5), tokens.get(0));
    }

}