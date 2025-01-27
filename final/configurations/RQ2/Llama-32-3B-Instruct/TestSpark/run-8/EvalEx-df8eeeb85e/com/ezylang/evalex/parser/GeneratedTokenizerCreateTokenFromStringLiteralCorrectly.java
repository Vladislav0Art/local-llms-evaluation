package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTokenizerCreateTokenFromStringLiteralCorrectly {

    public static class ExpressionConfiguration {
        private FunctionDictionaryIfc functionDictionaryIfc = new FunctionDictionaryIfc();
        private OperatorDictionaryIfc operatorDictionaryIfc = new OperatorDictionaryIfc();

        public void setFunctionDictionaryIfc(FunctionDictionaryIfc functionDictionaryIfc) {
            this.functionDictionaryIfc = functionDictionaryIfc;
        }

        public void setOperatorDictionaryIfc(OperatorDictionaryIfc operatorDictionaryIfc) {
            this.operatorDictionaryIfc = operatorDictionaryIfc;
        }
    }

    public static class FunctionDictionaryIfc {
    }

    public static class OperatorDictionaryIfc {
    }

    @Test
    public void tokenizerCreateTokenFromStringLiteralCorrectly() {
        // Arrange
        String expressionString = "5";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        functionDictionaryIfc = new FunctionDictionaryIfc();
        operatorDictionaryIfc = new OperatorDictionaryIfc();

        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);

        // Act
        List<Token> tokens = tokenizer.parse();

        // Assert
        assertEquals(1, tokens.size());
    }

}