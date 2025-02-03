package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;

public class GeneratedTestParse_SingleNumberLiteral {

    @Test
    public void testParse_SingleNumberLiteral() {
        ExpressionConfiguration configuration = mock(ExpressionConfiguration.class);
        when(configuration.getOperatorDictionary()).thenReturn(new com.ezylang.evalex.config.OperatorDictionaryIfc() {
            @Override
            public com.ezylang.evalex.operators.OperatorIfc getInfixOperator(String token) {
                return null;
            }

            @Override
            public com.ezylang.evalex.operators.OperatorIfc getPrefixOperator(String token) {
                return null;
            }

            @Override
            public com.ezylang.evalex.operators.OperatorIfc getPostfixOperator(String token) {
                return null;
            }
        });
        when(configuration.getFunctionDictionary()).thenReturn(new com.ezylang.evalex.config.FunctionDictionaryIfc() {
            @Override
            public com.ezylang.evalex.functions.FunctionIfc getFunction(String token) {
                return null;
            }

        }