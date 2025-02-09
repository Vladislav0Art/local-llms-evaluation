package com.ezylang.evalex.parser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseInvalidExpressionTest {

    @Test
    public void parseInvalidExpressionTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("1++2", config);
        Throwable thrown = catchThrowable(tokenizer::parse);
        assertThat(thrown).isInstanceOf(ParseException.class);
    }

}