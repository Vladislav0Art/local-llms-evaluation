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

public class GeneratedParseExpressionWithPrefixOperatorTest {

    @Test
    public void parseExpressionWithPrefixOperatorTest() {
        ExpressionConfiguration config = Mockito.mock(ExpressionConfiguration.class);
        OperatorDictionaryIfc operatorDictionary = Mockito.mock(OperatorDictionaryIfc.class);
        Mockito.when(config.getOperatorDictionary()).thenReturn(operatorDictionary);

        OperatorIfc operator = Mockito.mock(OperatorIfc.class);
        Mockito.when(operatorDictionary.hasPrefixOperator("-")).thenReturn(true);
        Mockito.when(operatorDictionary.getPrefixOperator("-")).thenReturn(operator);

        Tokenizer tokenizer = new Tokenizer("-5", config);
        List<Token> tokens = tokenizer.parse();

        Assert.assertEquals(2, tokens.size());
        Assert.assertEquals("-", tokens.get(0).getText());
        Assert.assertEquals(PREFIX_OPERATOR, tokens.get(0).getType());
        Assert.assertEquals("5", tokens.get(1).getText());
        Assert.assertEquals(NUMBER_LITERAL, tokens.get(1).getType());
    }

}