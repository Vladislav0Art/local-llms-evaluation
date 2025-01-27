package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseStringLiteralThrowsParseExceptionTest {

    @Test
    public void parseStringLiteralThrowsParseExceptionTest() throws ParseException {
        String expressionString = "\"string_literal\"";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }
}

}