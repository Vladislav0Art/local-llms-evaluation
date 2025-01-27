package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

public class GeneratedTest {

    @Test
    public void newTokenizerCreatesValidInstance() {
        String expressionString = "2+3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        assertNotNull(tokenizer);
    }

    @Test
    public void tokenizerParsingWorksCorrectly() throws ParseException {
        String expressionString = "2+3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(4, tokens.size());
    }

    @Test
    public void tokenizerParsingSingleNumberWorksCorrectly() throws ParseException {
        String expressionString = "2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(1, tokens.size());
    }

    @Test
    public void tokenizerParsingFunctionWorksCorrectly() throws ParseException {
        String expressionString = "sqrt(x)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.addFunction(new FunctionIfc("sqrt", 1));
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

    @Test
    public void tokenizerParsingFunctionWithVariableWorksCorrectly() throws ParseException {
        String expressionString = "x+2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.addFunction(new FunctionIfc("add", 1));
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

    @Test
    public void tokenizerParsingOperatorWorksCorrectly() throws ParseException {
        String expressionString = "2*3";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();
        operatorDictionary.addOperator("*", 1);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

    @Test
    public void tokenizerParsingOperatorWithVariableWorksCorrectly() throws ParseException {
        String expressionString = "x+2";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();
        operatorDictionary.addOperator("+", 1);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

    @Test
    public void tokenizerParsingExpressionWithMultipleOperatorsWorksCorrectly() throws ParseException {
        String expressionString = "2+3*4";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorDictionaryIfc operatorDictionary = new OperatorDictionaryIfc();
        operatorDictionary.addOperator("*", 1);
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(6, tokens.size());
    }

    @Test
    public void tokenizerParsingEmptyExpressionWorksCorrectly() throws ParseException {
        String expressionString = "";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(0, tokens.size());
    }

    @Test
    public void tokenizerParsingSingleSpaceWorksCorrectly() throws ParseException {
        String expressionString = " ";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(0, tokens.size());
    }

}