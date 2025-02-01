package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseExpressionUnexpectedTokenAfterInfixOperatorTest {

    @Test
    public void parseExpressionUnexpectedTokenAfterInfixOperatorTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1 + + 1", config);

        tokenizer.parse();
    }

}