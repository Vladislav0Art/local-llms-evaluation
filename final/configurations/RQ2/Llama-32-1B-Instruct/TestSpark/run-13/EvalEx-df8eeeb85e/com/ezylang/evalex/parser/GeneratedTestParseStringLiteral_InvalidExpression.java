package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.TokenType;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestParseStringLiteral_InvalidExpression {

    public class TestParseStringLiteral {
        private String expressionString = "1 + 2";
        private ExpressionConfiguration configuration = new ExpressionConfiguration();
        private FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        private OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        @Test
        public void testParseStringLiteral_InvalidExpression() {
            ExpressionConfiguration invalidConfig = new ExpressionConfiguration();
            FunctionDictionaryIfc invalidDict = new FunctionDictionaryIfc();
            OperatorDictionaryIfc invalidOperatorDict = new OperatorDictionaryIfc();
            Tokenizer tokenizer = new Tokenizer(expressionString, invalidConfig);
            List<Token> tokens = tokenizer.parse();
            assertNotNull(tokens);
        }

    }