package com.ezylang.evalex.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.junit.jupiter.api.BeforeEach;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestParseLiteral {

    @Mock
    private ExpressionConfiguration configuration;

    @InjectMocks
    private Tokenizer tokenizer;

    @Test
    public void testParseLiteral() {
        List<Token> tokens = tokenizer.parse().stream()
                .collect(Collectors.toList());
        Mockito.verify(tokenizer).parseStringLiteral(Mockito.any(String.class), Mockito.any(ExpressionConfiguration.class));
        assertNotNull(tokens);
    }

}