package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedParseWhenExpressionHasInvalidCharacterTest {

    @Test
    public void parseWhenExpressionHasInvalidCharacterTest() throws ParseException {
        String expression = "3+%4";
        Tokenizer tokenizer = new Tokenizer(expression, null);
        tokenizer.parse();
    }

}