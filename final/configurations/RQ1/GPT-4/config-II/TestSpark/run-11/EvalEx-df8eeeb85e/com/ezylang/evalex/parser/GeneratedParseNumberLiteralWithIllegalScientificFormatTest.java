package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.ParseException;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;
import static org.mockito.Mockito.*;

public class GeneratedParseNumberLiteralWithIllegalScientificFormatTest {

    @Test
    public void parseNumberLiteralWithIllegalScientificFormatTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1.23e", new ExpressionConfiguration());
        try {
            tokenizer.parse();
            Assert.fail("Exception should have been thrown");
        } catch (ParseException ex) {
            Assert.assertEquals("Illegal scientific format", ex.getMessage());
        }
    }

}