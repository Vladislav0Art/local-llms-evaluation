package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedParseStringLiteralThrowsParseExceptionWhenInvalidStringLiteral {

    @Test
    public void parseStringLiteralThrowsParseExceptionWhenInvalidStringLiteral() {
        Tokenizer tokenizer = new Tokenizer("\"string\" ");
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }

}