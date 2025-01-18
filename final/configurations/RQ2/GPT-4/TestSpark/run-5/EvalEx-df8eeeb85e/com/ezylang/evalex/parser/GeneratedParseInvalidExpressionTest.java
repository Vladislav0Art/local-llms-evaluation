package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws ParseException {
        String expressionString = "5 +";
        Tokenizer tokenizer = new Tokenizer(expressionString, null);
        tokenizer.parse();
    }

}