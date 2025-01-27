package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseMethodReturnsCorrectlyFormattedTokenList {

    @Test
    public void parseMethodReturnsCorrectlyFormattedTokenList() throws ParseException {
        String expressionString = "1+2*3";
        List<Token> tokens = new Tokenizer(expressionString).parse();
        assertTrue(tokens.size() == 5);
        assertEquals(PLUS, tokens.get(0).getType());
        assertEquals(NUMBER, tokens.get(1).getType());
        assertEquals(NUMBER, tokens.get(2).getType());
        assertEquals(MULTIPLY, tokens.get(3).getType());
        assertEquals(NUMBER, tokens.get(4).getType());
    }

}