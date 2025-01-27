package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTest {

    private int typeNumber;

    public Token(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public int getTypeNumber() {
        return typeNumber;
    }
}

public interface ExpressionConfiguration {
    FunctionDictionaryIfc getFunctionDictionary();

    OperatorDictionaryIfc getOperatorDictionary();
}

public class FunctionDictionaryIfc {
    // implement methods
}

public class OperatorDictionaryIfc {
    // implement methods
}

import org.junit.Test;
import static org.hamcrest.CoreMatchers .*;
        import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

@RunWith(org.junit.runners.JUnit4.class)
public class TokenizerTest {

    public class Tokenizer {
        private ExpressionConfiguration configuration;

        public Tokenizer(String expressionString, ExpressionConfiguration configuration) {
            this.configuration = configuration;
        }

        public List<Token> parse() {
            // implement method
            return new ArrayList<>();
        }

        public Token parseStringLiteral() {
            // implement method
            return null;
        }
    }

}