package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;

import static com.ezylang.evalex.parser.Token.TokenType.*;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Collections;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() throws Exception {
        FunctionDictionaryIfc functionDictionary = Mockito.mock(FunctionDictionaryIfc.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        ExpressionConfiguration configuration = new ExpressionConfiguration(functionDictionary, operatorDictionary);
        Tokenizer tokenizer = new Tokenizer("1**1", configuration);
        tokenizer.parse();
    }

}