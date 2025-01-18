package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseStringLiteralWhenStringIsNotTerminatedTest {

    @Test
    public void parseStringLiteralWhenStringIsNotTerminatedTest() throws ParseException {
        String expression = "'HelloWorld";
        Tokenizer tokenizer = new Tokenizer(expression, null);
        tokenizer.parseStringLiteral();
    }

}