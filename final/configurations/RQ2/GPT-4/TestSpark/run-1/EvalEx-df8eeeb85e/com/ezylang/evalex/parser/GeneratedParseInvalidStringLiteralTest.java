package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseInvalidStringLiteralTest {

    @Test
    public void parseInvalidStringLiteralTest() throws ParseException {
        ExpressionConfiguration mockConfig = Mockito.mock(ExpressionConfiguration.class);
        String mockExpression = "\"Hello World";
        Tokenizer tokenizer = new Tokenizer(mockExpression, mockConfig);
        tokenizer.parseStringLiteral();
    }

}