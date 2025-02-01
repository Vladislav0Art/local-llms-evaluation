package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import com.ezylang.evalex.parser.Tokenizer;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertEquals;

public class GeneratedParseBraceBalanceTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void parseBraceBalanceTest() {
        String expression = "((2+3)";
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(expression, config);
        thrown.expect(ParseException.class);
        tokenizer.parse();
    }

}