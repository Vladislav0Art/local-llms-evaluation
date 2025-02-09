package com.ezylang.evalex.parser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseStringLiteralInvalidTest {

    @Test
    public void parseStringLiteralInvalidTest() {
        ExpressionConfiguration config = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer("\"Hello, World!", config);
        Throwable thrown = catchThrowable(tokenizer::parseStringLiteral);
        assertThat(thrown).isInstanceOf(ParseException.class);
    }

}