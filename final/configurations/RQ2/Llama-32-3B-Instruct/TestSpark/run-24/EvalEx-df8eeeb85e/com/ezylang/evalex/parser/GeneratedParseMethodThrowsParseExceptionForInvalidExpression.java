package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseMethodThrowsParseExceptionForInvalidExpression {

    @Test
    public void parseMethodThrowsParseExceptionForInvalidExpression() {
        String expressionString = "1+2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration(); // Set any needed configuration properties here
        assertThrows(ParseException.class, () -> new Tokenizer(expressionString, configuration).parse());
    }

}