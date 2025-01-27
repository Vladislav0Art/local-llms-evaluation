package com.ezylang.evalex.parser;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestParseInvalidExpression {

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
}

public class OperatorDictionary implements Dictionary {
    // dictionary implementation here
    public void init() {
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

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TokenizerTest {

    private static Tokenizer tokenizer;

    @BeforeClass
    public static void setup() {
        tokenizer = new Tokenizer();
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.setFunctionDictionary(new FunctionDictionary());
        configuration.setOperatorDictionary(new OperatorDictionary());
        configuration.init();
        tokenizer.setExpressionConfiguration(configuration);
    }

    @Test
    public void testParseInvalidExpression() throws ParseException {
        String expression = "abc";
        assertThrows(ParseException.class, () -> tokenizer.parse(expression));
    }

    private static List<String> tokenList;

    @AfterClass
    public static void cleanUp() {
        tokenList.clear();
    }

}