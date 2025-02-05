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

public class GeneratedParseStringLiteralNoEndQuoteTest {

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