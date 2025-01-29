package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseKeywordLiteralTest {

    private Tokenizer tokenizer = new Tokenizer("1 + 2", ExpressionConfiguration.DEFAULT);

    @Test
    public void parseKeywordLiteralTest() {
        when(expressionString()).thenReturn("#define");
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
        assertEquals(new KeywordLiteralToken("#define"), tokens.get(0));
    }

}