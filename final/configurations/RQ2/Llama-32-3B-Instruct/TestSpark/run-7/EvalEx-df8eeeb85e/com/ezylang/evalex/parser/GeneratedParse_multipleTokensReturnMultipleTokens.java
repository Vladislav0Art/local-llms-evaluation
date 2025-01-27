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

public class GeneratedParse_multipleTokensReturnMultipleTokens {

    @Mock
    private ExpressionConfiguration configuration;

    @Test
    public void parse_multipleTokensReturnMultipleTokens() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("token1 token2", configuration);
        List<Token> expectedTokens = Arrays.asList(
                new Token(TokenType.Token, "token1"),
                new Token(TokenType.Token, "token2")
        );
        List<Token> actualTokens = tokenizer.parse();
        // arrange, act and assert
    }

}