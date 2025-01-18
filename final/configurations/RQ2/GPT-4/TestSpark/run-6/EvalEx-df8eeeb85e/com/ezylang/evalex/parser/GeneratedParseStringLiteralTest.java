package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseStringLiteralTest {

    ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);

    @Test
    public void parseStringLiteralTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"exp\"(5)", config);
        Token token = tokenizer.parseStringLiteral();
        assertEquals(Token.TokenType.STRINGPARAM, token.type);
    }

}