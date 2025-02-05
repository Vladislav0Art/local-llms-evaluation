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

public class GeneratedParseStringLiteralTest {

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

}