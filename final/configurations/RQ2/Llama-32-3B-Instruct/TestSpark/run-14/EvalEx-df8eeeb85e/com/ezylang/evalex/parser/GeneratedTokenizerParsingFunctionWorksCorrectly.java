package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

public class GeneratedTokenizerParsingFunctionWorksCorrectly {

    @Test
    public void tokenizerParsingFunctionWorksCorrectly() throws ParseException {
        String expressionString = "sqrt(x)";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        configuration.addFunction(new FunctionIfc("sqrt", 1));
        Tokenizer tokenizer = new Tokenizer(expressionString, configuration);
        List<Token> tokens = tokenizer.parse();
        assertEquals(3, tokens.size());
    }

}