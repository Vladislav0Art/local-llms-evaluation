package com.ezylang.evalex.parser;

import com.ezylang.evalex.parser.*;
import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedParseTest {

    @Test
    public void parseTest() throws ParseException {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        Tokenizer tokenizer = new Tokenizer("1+1", config);
        List<Token> result = tokenizer.parse();
        assert result != null;
    }

}