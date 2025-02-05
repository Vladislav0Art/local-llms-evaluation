package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringLiteralWithoutClosingQuoteTest {

    @Test
    public void parseStringLiteralWithoutClosingQuoteTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"Hello World", configuration);

        tokenizer.parseStringLiteral();
    }

}