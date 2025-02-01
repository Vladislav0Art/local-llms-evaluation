package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.Optional;

public class GeneratedParseUnexpectedTokenAfterInfixOperatorTest {

    @Test
    public void parseUnexpectedTokenAfterInfixOperatorTest() throws ParseException {
        String expression = "5 + /";
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, configuration);

        tokenizer.parse();
    }

}