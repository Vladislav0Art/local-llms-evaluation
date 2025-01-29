package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Token.TokenType;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTestParse {

    public class TestParseStringLiteral {
        private String expressionString = "1 + 2";
        private ExpressionConfiguration configuration = new ExpressionConfiguration();
        private FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
        private OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();

        @Test
        public void testParse() {
            ExpressionConfiguration configuration = new ExpressionConfiguration();
            FunctionDictionaryIfc functionDict = new FunctionDictionaryIfc();
            OperatorDictionaryIfc operatorDict = new OperatorDictionaryIfc();
            Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
            List<Token> tokens = tokenizer.parse();
            assertEquals(3, tokens.size());
        }
    }

}