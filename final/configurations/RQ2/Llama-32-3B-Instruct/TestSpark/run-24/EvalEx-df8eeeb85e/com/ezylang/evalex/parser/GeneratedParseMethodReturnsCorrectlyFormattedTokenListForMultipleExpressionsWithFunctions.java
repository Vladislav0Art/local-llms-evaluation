package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseMethodReturnsCorrectlyFormattedTokenListForMultipleExpressionsWithFunctions {

    @Test
    public void parseMethodReturnsCorrectlyFormattedTokenListForMultipleExpressionsWithFunctions() throws ParseException {
        String expressionString1 = "1+2*3";
        String functionExpression = "sin(45)";
        List<Token> tokens = new Tokenizer(expressionString1 + functionExpression).parse();
        assertTrue(tokens.size() == 9);
    }

}