package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseMultipleTokensTest {

    @Test
    public void parseMultipleTokensTest() {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1 2 3", configuration);

        List<Token> result = tokenizer.parse();

        assertNotNull(result);
        assertEquals(3, result.size());
        for (Token token : result) {
            assertEquals(Token.TokenType.TT_NUMBER, token.type);
        }
    }

}