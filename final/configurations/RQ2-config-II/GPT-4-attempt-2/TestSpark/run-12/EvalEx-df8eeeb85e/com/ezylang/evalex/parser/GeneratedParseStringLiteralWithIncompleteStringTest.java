package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.STRING_LITERAL;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedParseStringLiteralWithIncompleteStringTest {

    @Test
    public void parseStringLiteralWithIncompleteStringTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        when(config.getStringLiteralStartDelim()).thenReturn("\"");
        when(config.getStringLiteralEndDelim()).thenReturn("\"");

        String expression = "\"Test";
        Tokenizer tokenizer = new Tokenizer(expression, config);

        tokenizer.parseStringLiteral();
    }

}