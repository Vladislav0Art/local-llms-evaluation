package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseMultipleCharactersReturnCorrectTokens {

    @Test
    public void parseMultipleCharactersReturnCorrectTokens() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("++", ExpressionConfiguration.create());
        List<Token> tokens = tokenizer.parse();
        assertEquals(2, tokens.size());
        assertEquals(TokenType.PLUS, tokens.get(0).getType());
        assertEquals(TokenType.PLUS, tokens.get(1).getType());
    }

}