package com.ezylang.evalex.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedParse_emptyExpression_throwsParseException {

    @Test
    public void parse_emptyExpression_throwsParseException() {
        Exception exception = assertThrows(ParseException.class, () -> new Tokenizer("", null).parse());
        assertEquals("Empty expression string is not allowed.", exception.getMessage());
    }

}