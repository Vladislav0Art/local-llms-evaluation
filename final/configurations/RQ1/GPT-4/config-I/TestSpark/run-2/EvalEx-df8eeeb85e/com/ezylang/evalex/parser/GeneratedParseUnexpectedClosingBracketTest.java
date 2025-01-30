package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.OperatorDictionary;
import com.ezylang.evalex.functions.Function;
import com.ezylang.evalex.functions.FunctionDictionary;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.operators.Operator;
import com.ezylang.evalex.Expression.ExpressionContext;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.List;
import java.util.HashMap;

public class GeneratedParseUnexpectedClosingBracketTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseUnexpectedClosingBracketTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1+1)*2", createExpressionConfiguration());
        thrown.expect(ParseException.class);
        thrown.expectMessage("Unexpected closing brace");
        tokenizer.parse();
    }

}