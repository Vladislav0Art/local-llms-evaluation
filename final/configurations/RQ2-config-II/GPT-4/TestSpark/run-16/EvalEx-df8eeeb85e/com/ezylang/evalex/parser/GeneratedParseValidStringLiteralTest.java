package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseValidStringLiteralTest {

    @Test
    public void parseValidStringLiteralTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"Valid string\"", configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
        assertEquals(Token.TokenType.TOKEN_TYPE_STRING, tokens.get(0).getType());
    }

}