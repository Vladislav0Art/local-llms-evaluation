package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestTokenizeStringLiteral {

    @Mock
    private ExpressionConfiguration configuration;

    @InjectMocks
    private Tokenizer tokenizer;

    @Test
    public void testTokenizeStringLiteral() throws ParseException {
        String expression = "1 + 2";
        List<Token> tokens = tokenizer.parseStringLiteral(expression, configuration);
        assertTrue(tokens.size() == 3);
        assertEquals(1, tokens.get(0).getNumber());
        assertEquals("+", tokens.get(1).getType());
        assertEquals(2, tokens.get(2).getNumber());
    }

}