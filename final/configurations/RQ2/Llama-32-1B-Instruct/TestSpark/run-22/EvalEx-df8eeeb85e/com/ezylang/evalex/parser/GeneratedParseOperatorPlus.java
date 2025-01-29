package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang_evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;

public class GeneratedParseOperatorPlus {

    private Tokenizer tokenizer = new Tokenizer();

    @Test
    public void parseOperatorPlus() throws ParseException {
        String expressionString = "+";
        ExpressionConfiguration configuration = ExpressionConfiguration.empty();
        List<Token> expectedTokens = parseTokenStrings(expressionString, configuration);
        List<Token> actualTokens = tokenizer.parseOperatorPlus();
        assertEquals(expectedTokens, actualTokens);
    }

}