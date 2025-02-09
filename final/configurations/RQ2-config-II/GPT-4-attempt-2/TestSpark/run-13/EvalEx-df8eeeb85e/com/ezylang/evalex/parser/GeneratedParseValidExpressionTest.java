package com.ezylang.evalex.parser;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseValidExpressionTest {

    @Test
    public void parseValidExpressionTest() throws ParseException {
        ExpressionConfiguration config = new ExpressionConfiguration();
        OperatorIfc mockOperator = Mockito.mock(OperatorIfc.class);
        Mockito.when(mockOperator.is("ADDITION")).thenReturn(true);
        config.getOperators().insert(mockOperator);
        Tokenizer tokenizer = new Tokenizer("1+2", config);
        List<Token> tokens = tokenizer.parse();
        assertThat(tokens).hasSize(3);
    }

}