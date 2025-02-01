package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1 + 1", config);

        assertEquals(3, tokenizer.parse().size());
    }

    @Test
    public void parseExpressionMissingBraceTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("(1 + 1", config);

        tokenizer.parse();
    }

    @Test
    public void parseExpressionUnexpectedTokenAfterInfixOperatorTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1 + + 1", config);

        tokenizer.parse();
    }

    @Test
    public void parseStringLiteralMissingQuotationTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"string", config);

        tokenizer.parse();
    }

    @Test
    public void parseNumberLiteralTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("123235", config);
        Token token = tokenizer.parse().get(0);

        assertEquals("123235", token.getValue());
    }

    @Test
    public void parseNumberLiteralIllegalCharTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("123A235", config);

        tokenizer.parse();
    }

    @Test
    public void parseNumberLiteralWithScientificNotationTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1.23E-4", config);
        Token token = tokenizer.parse().get(0);

        assertEquals("1.23E-4", token.getValue());
    }

    @Test
    public void parseNumberLiteralIllegalScientificFormatTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1.23E-", config);

        tokenizer.parse();
    }

    @Test
    public void parseIdentifierTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("abc123_test", config);
        Token token = tokenizer.parse().get(0);

        assertEquals("abc123_test", token.getValue());
    }

}