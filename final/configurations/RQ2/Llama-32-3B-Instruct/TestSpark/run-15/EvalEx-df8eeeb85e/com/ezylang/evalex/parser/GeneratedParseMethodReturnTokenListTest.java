package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseMethodReturnTokenListTest {

    @Test
    public void parseMethodReturnTokenListTest() throws ParseException {
        String expressionString = "expression_string";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokenList = tokenizer.parse();
        assertTrue(tokenList != null && !tokenList.isEmpty());
    }

}