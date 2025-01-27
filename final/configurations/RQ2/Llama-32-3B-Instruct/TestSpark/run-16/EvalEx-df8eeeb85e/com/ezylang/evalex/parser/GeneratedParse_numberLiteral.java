package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParse_numberLiteral {

    @Test
    public void parse_numberLiteral() throws ParseException {
        List<Token> tokens = new ArrayList<>();
        List<String> expectedTokens = new ArrayList<>();
        expectedTokens.add("123");
        assertEquals(expectedTokens, Tokenizer.class.newInstance()
                .parse("123")
                .collect(Collectors.toList()));
    }

}