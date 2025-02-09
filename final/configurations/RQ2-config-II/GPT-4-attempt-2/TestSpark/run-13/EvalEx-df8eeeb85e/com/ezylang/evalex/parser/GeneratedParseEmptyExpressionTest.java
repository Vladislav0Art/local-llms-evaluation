package com.ezylang.evalex.parser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseEmptyExpressionTest {

    @Test
    public void parseEmptyExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("", config);
        List<Token> tokens = tokenizer.parse();
        assertThat(tokens).isEmpty();
    }

}