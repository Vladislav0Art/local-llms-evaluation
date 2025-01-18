package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import com.ezylang.evalex.config.ExpressionConfiguration;

import java.util.List;

import org.junit.Test;

public class GeneratedParseExpressionWithAllCharactersTest {

    @Test
    public void parseExpressionWithAllCharactersTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1 + 1", configuration);
        List<Token> tokenList = tokenizer.parse();
        assertEquals(3, tokenList.size());
    }

}