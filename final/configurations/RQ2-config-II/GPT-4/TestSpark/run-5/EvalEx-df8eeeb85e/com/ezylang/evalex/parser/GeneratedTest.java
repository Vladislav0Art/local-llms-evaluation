package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.exceptions.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void parseValidExpressionTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String validExpression = "2+2";
        Tokenizer tokenizer = new Tokenizer(validExpression, mockConfig);

        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(3, tokens.size());
        } catch (ParseException e) {
            fail("Parsing failed for valid expression");
        }
    }

    @Test
    public void parseInvalidExpressionTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String invalidExpression = "2++2";
        Tokenizer tokenizer = new Tokenizer(invalidExpression, mockConfig);

        try {
            tokenizer.parse();
            fail("Parse method did not throw ParseException for invalid expression");
        } catch (ParseException ignored) {
        }
    }

    @Test
    public void parseStringLiteralTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        when(mockConfig.getStringLiteralStart()).thenReturn('\"');
        String expressionWithLiteral = "2+\"string\"";
        Tokenizer tokenizer = new Tokenizer(expressionWithLiteral, mockConfig);

        try {
            Token token = tokenizer.parseStringLiteral();
            assertEquals("string", token.toString());
        } catch (ParseException e) {
            fail("Parsing failed for valid string literal");
        }
    }

    @Test
    public void parseStringLiteralNoEndQuoteTest() {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        when(mockConfig.getStringLiteralStart()).thenReturn('\"');
        String expressionWithLiteral = "2+\"string";
        Tokenizer tokenizer = new Tokenizer(expressionWithLiteral, mockConfig);

        try {
            tokenizer.parseStringLiteral();
            fail("parseStringLiteral did not throw ParseException for string literal without end quote");
        } catch (ParseException ignored) {
        }
    }

}