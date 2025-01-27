package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParse_expressionWithWhitespaceIsIgnored {

    @Test
    public void parse_expressionWithWhitespaceIsIgnored() throws ParseException {
        List<Token> tokens = new ArrayList<>();
        List<String> expectedTokens = new ArrayList<>();
        expectedTokens.add("+");
        assertEquals(expectedTokens, Tokenizer.class.newInstance()
                .parse(" + ")
                .collect(Collectors.toList()));
    }

}