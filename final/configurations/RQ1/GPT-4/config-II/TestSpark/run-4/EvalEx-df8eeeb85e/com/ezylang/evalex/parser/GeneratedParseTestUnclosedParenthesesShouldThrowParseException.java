package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionary;
import com.ezylang.evalex.config.OperatorDictionary;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedParseTestUnclosedParenthesesShouldThrowParseException {

    @Test
    public void parseTestUnclosedParenthesesShouldThrowParseException() throws ParseException {
        OperatorDictionary operatorDictionary = new OperatorDictionary();
        FunctionDictionary functionDictionary = new FunctionDictionary();
        ExpressionConfiguration configuration = new ExpressionConfiguration(operatorDictionary, functionDictionary);
        Tokenizer tokenizer = new Tokenizer("(1*(2+3", configuration);

        tokenizer.parse();
    }

}