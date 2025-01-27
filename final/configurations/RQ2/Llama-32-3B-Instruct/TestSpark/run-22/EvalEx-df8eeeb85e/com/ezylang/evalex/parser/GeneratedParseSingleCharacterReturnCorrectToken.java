package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseSingleCharacterReturnCorrectToken {

    @Test
    public void parseSingleCharacterReturnCorrectToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("+", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(TokenType.PLUS, tokens.get(0).getType());
    }

}