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

public class GeneratedParse_multipleNumberLiteralsReturnMultipleNumberLiterals {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parse_multipleNumberLiteralsReturnMultipleNumberLiterals() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("1.23 456", configuration);
        List<Token> expectedTokens = Arrays.asList(
                new Token(TokenType.NumberLiteral, "1.23"),
                new Token(TokenType.NumberLiteral, "456")
        );
        List<Token> actualTokens = tokenizer.parse();
        assertThat(actualTokens, is(expectedTokens));
    }

}