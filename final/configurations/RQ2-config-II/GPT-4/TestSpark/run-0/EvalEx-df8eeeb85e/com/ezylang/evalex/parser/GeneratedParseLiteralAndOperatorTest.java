package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token.TokenType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseLiteralAndOperatorTest {

    @Test
    public void parseLiteralAndOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("\"literal\" + \"literal\"", configuration);
        List<Token> tokens = tokenizer.parse();

        assertTrue(tokens.get(0).getType() == TokenType.STRINGPARAM);
        assertEquals("\"literal\"", tokens.get(0).getSurface());

        assertTrue(tokens.get(1).getType() == TokenType.OPERATOR);
        assertEquals("+", tokens.get(1).getSurface());

        assertTrue(tokens.get(2).getType() == TokenType.STRINGPARAM);
        assertEquals("\"literal\"", tokens.get(2).getSurface());
    }

}