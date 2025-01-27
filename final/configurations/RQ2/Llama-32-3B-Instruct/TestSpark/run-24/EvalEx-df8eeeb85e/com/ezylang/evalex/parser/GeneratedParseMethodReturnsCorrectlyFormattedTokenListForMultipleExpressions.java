package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseMethodReturnsCorrectlyFormattedTokenListForMultipleExpressions {

    @Test
    public void parseMethodReturnsCorrectlyFormattedTokenListForMultipleExpressions() throws ParseException {
        String expressionString1 = "1+2*3";
        String expressionString2 = "4/5";
        List<Token> tokens = new Tokenizer(expressionString1 + expressionString2).parse();
        assertTrue(tokens.size() == 9);
    }

}