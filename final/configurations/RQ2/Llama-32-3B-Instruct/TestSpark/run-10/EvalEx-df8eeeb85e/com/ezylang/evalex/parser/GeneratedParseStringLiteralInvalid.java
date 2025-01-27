package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedParseStringLiteralInvalid {

    @Test
    public void parseStringLiteralInvalid() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"", null);
        assertThrows(ParseException.class, () -> tokenizer.parseStringLiteral());
    }

}