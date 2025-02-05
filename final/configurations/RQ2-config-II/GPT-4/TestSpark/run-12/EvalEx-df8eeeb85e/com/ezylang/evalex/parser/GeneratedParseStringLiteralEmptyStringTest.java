package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseStringLiteralEmptyStringTest {

    @Test
    public void parseStringLiteralEmptyStringTest() throws ParseException {
        String emptyString = "";
        ExpressionConfiguration config = mock(ExpressionConfiguration.class);

        Tokenizer tokenizer = new Tokenizer(emptyString, config);
        tokenizer.parseStringLiteral();
    }

}