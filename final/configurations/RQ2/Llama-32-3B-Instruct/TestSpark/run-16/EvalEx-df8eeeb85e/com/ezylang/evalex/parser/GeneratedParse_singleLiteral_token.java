package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParse_singleLiteral_token {

    @Test
    public void parse_singleLiteral_token() throws ParseException {
        List<Token> tokens = new ArrayList<>();
        List<String> expectedTokens = new ArrayList<>();
        expectedTokens.add("\"hello\"");
        assertEquals(expectedTokens, Tokenizer.class.newInstance()
                .parse("hello")
                .collect(Collectors.toList()));
    }

}