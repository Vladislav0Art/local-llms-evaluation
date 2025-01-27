package com.ezylang.evalex.parser;

import static org.junit.Assert.*;
import static org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private FunctionDictionary functionDictionary = new FunctionDictionary();
    private OperatorDictionary operatorDictionary = new OperatorDictionary();

    public void init() {
        functionDictionary.init();
        operatorDictionary.init();
    }

    public FunctionDictionary getFunctionDictionary() {
        return functionDictionary;
    }

    public OperatorDictionary getOperatorDictionary() {
        return operatorDictionary;
    }
}

public class FunctionDictionary implements Dictionary {
    // dictionary implementation here
    public void init() {
        // implementation here
    }

    @Override
    public void initialize() {
        // implementation here
    }
}

public class OperatorDictionary implements Dictionary {
    // dictionary implementation here
    public void init() {
        // implementation here
    }

    @Override
    public void initialize() {
        // implementation here
    }
}

public class Tokenizer implements Parseable {
    private ExpressionConfiguration configuration;
    private List<String> tokenList = new ArrayList<>();

    public void setExpressionConfiguration(ExpressionConfiguration config) {
        this.configuration = config;
    }

    public ExpressionConfiguration getExpressionConfiguration() {
        return configuration;
    }

    @Override
    public void parse(String expression) throws ParseException {
        // parsing logic here
        tokenList.add("1");
        tokenList.add("+");
        tokenList.add("2");
        tokenList.add("*");
        tokenList.add("3");
    }
}

public class ParseException extends Exception {
    // exception implementation here
}

import static org.junit.Assert .*;

        import static org.junit.runner.RunWith;
import static org.mockito.Mockito.mock;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class TokenizerTest {

    @Mock
    private ExpressionConfiguration configuration;

    @BeforeClass
    public static void setup() {
        // set up before class
    }

    @AfterClass
    public static void cleanUp() {
        // clean up after class
    }

}