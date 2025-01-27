package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParse_multipleLiteralTokens {

    @Test
    public void parse_multipleLiteralTokens() throws ParseException {
        List<Token> tokens = new ArrayList<>();
        List<String> expectedTokens = new ArrayList<>();
        expectedTokens.add("\"hello\"");
        expectedTokens.add("\"world\"");
        assertEquals(expectedTokens, Tokenizer.class.newInstance()
                .parse("hello world")
                .collect(Collectors.toList()));
    }

}