package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParse_functionDefinition {

    @Test
    public void parse_functionDefinition() throws ParseException {
        List<Token> tokens = new ArrayList<>();
        List<String> expectedTokens = new ArrayList<>();
        expectedTokens.add("(");
        expectedTokens.add("add");
        expectedTokens.add(")");
        assertEquals(expectedTokens, Tokenizer.class.newInstance()
                .parse("add(1 + 2)")
                .collect(Collectors.toList()));
    }

}