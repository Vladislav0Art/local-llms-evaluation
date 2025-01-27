package com.ezylang.evalex.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import com.ezylang.evalex.config.ExpressionConfiguration;
import com.ezylang.evalex.config.FunctionDictionaryIfc;
import com.ezylang.evalex.config.OperatorDictionaryIfc;
import com.ezylang.evalex.functions.FunctionIfc;
import com.ezylang.evalex.operators.OperatorIfc;
import com.ezylang.evalex.parser.Token;
import com.ezylang.evalex.parser.Tokenizer;

import java.util.ArrayList;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParse_numberLiteralDecimalReturnsNumberLiteralToken {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parse_numberLiteralDecimalReturnsNumberLiteralToken() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1.23", configuration);
        Token expectedToken = new Token(TokenType.NumberLiteral, "1.23");
        Token actualToken = tokenizer.parseStringLiteral();
        // arrange, act and assert
    }

}