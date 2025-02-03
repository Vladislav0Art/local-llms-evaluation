package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testParse_EmptyString() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(new OperatorDictionaryIfc() {
            @Override
            public OperatorIfc getInfixOperator(String token) {
                return null;
            }

            @Override
            public OperatorIfc getPrefixOperator(String token) {
                return null;
            }

            @Override
            public OperatorIfc getPostfixOperator(String token) {
                return null;
            }
        });
        when(configuration.getFunctionDictionary()).thenReturn(new FunctionDictionaryIfc() {
            @Override
            public FunctionIfc getFunction(String name) {
                return null;
            }
        });
        Tokenizer tokenizer = new Tokenizer("", configuration);
        try {
            List<Token> tokens = tokenizer.parse();
            assertTrue(tokens.isEmpty());
        } catch (ParseException e) {
            fail();
        }
    }

    @Test
    public void testParse_SingleNumberLiteral() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(new OperatorDictionaryIfc() {
            @Override
            public OperatorIfc getInfixOperator(String token) {
                return null;
            }

            @Override
            public OperatorIfc getPrefixOperator(String token) {
                return null;
            }

            @Override
            public OperatorIfc getPostfixOperator(String token) {
                return null;
            }
        });
        when(configuration.getFunctionDictionary()).thenReturn(new FunctionDictionaryIfc() {
            @Override
            public FunctionIfc getFunction(String name) {
                return null;
            }
        });
        Tokenizer tokenizer = new Tokenizer("123", configuration);
        try {
            List<Token> tokens = tokenizer.parse();
            assertEquals(1, tokens.size());
            assertEquals(TokenType.NUMBER_LITERAL, tokens.get(0).getType());
            assertEquals("123", tokens.get(0).getValue());
        } catch (ParseException e) {
            fail();
        }
    }

}