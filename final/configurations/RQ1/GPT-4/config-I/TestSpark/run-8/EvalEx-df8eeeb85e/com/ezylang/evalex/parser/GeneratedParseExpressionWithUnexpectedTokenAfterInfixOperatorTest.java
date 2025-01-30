package com.ezylang.evalex.parser;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;

import static com.ezylang.evalex.parser.Token.TokenType.*;

public class GeneratedParseExpressionWithUnexpectedTokenAfterInfixOperatorTest {

    @Test
    public void parseExpressionWithUnexpectedTokenAfterInfixOperatorTest() {
        Tokenizer tokenizer = new Tokenizer("1 + + 2", new ExpressionConfiguration());
        tokenizer.parse();
    }

}