package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralMissingQuotationTest {

    @Test
    public void parseStringLiteralMissingQuotationTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"string", config);

        tokenizer.parse();
    }

}