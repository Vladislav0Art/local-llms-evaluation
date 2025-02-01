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

public class GeneratedTest {

    @Test
    public void parseExpressionWithImplicitMultiplicationNotAllowedTest() throws ParseException {
        ExpressionConfiguration configurationMock = mock(ExpressionConfiguration.class);
        when(configurationMock.isImplicitMultiplicationAllowed()).thenReturn(false);
        Tokenizer tokenizer = new Tokenizer("3(2+2)", configurationMock);
        try {
            tokenizer.parse();
            Assert.fail("Exception should have been thrown");
        } catch (ParseException ex) {
            Assert.assertEquals("Missing operator", ex.getMessage());
        }
    }

    @Test
    public void parseExpressionWithImplicitMultiplicationAllowedTest() throws ParseException {
        ExpressionConfiguration configurationMock = mock(ExpressionConfiguration.class);
        when(configurationMock.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("3(2+2)", configurationMock);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(6, tokens.size());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
    }

    @Test
    public void parseInvalidExpressionAfterInfixTokenTest() throws ParseException {
        ExpressionConfiguration configurationMock = mock(ExpressionConfiguration.class);
        when(configurationMock.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("3*+2", configurationMock);
        try {
            tokenizer.parse();
            Assert.fail("Exception should have been thrown");
        } catch (ParseException ex) {
            Assert.assertEquals("Unexpected token after infix operator", ex.getMessage());
        }
    }

    @Test
    public void parseValidExpressionAfterInfixTokenTest() throws ParseException {
        ExpressionConfiguration configurationMock = mock(ExpressionConfiguration.class);
        when(configurationMock.isImplicitMultiplicationAllowed()).thenReturn(true);
        Tokenizer tokenizer = new Tokenizer("3*2", configurationMock);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals(NUMBER_LITERAL, tokens.get(0).getType());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(NUMBER_LITERAL, tokens.get(2).getType());
    }

    @Test
    public void parseStringLiteralWithMissingClosingQuoteTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"test", new ExpressionConfiguration());
        try {
            tokenizer.parse();
            Assert.fail("Exception should have been thrown");
        } catch (ParseException ex) {
            Assert.assertEquals("Closing quote not found", ex.getMessage());
        }
    }

    @Test
    public void parseValidStringLiteralTest() throws ParseException {
        Tokenizer tokenizer = new Tokenizer("\"test\"", new ExpressionConfiguration());
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(1, tokens.size());
        Assert.assertEquals(STRING_LITERAL, tokens.get(0).getType());
    }

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

    @Test
    public void isAtNumberStartWithDecimalNumberTest() {
        Tokenizer tokenizer = new Tokenizer("1.23", new ExpressionConfiguration());
        Assert.assertTrue(tokenizer.isAtNumberStart());
    }

    @Test
    public void parseIdentifierWithPrefixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addPrefixOperator("test", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("test(1)", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(4, tokens.size());
        Assert.assertEquals(PREFIX_OPERATOR, tokens.get(0).getType());
        Assert.assertEquals(operatorMock, tokens.get(0).getOperator());
    }

    @Test
    public void parseIdentifierWithPostfixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addPostfixOperator("test", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("1test", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(2, tokens.size());
        Assert.assertEquals(POSTFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(operatorMock, tokens.get(1).getOperator());
    }

    @Test
    public void parseIdentifierWithInfixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addInfixOperator("test", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("1 test 2", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(operatorMock, tokens.get(1).getOperator());
    }

    @Test
    public void parseIdentifierWithFunctionTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        FunctionIfc functionMock = mock(FunctionIfc.class);
        configuration.addFunction("test", functionMock);
        Tokenizer tokenizer = new Tokenizer("test(1)", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(4, tokens.size());
        Assert.assertEquals(FUNCTION, tokens.get(0).getType());
        Assert.assertEquals(functionMock, tokens.get(0).getFunction());
    }

    @Test
    public void parseOperatorWithInfixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addInfixOperator("++", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("1 ++ 2", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(operatorMock, tokens.get(1).getOperator());
    }

    @Test
    public void invalidTokenAfterInfixOperatorTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        OperatorIfc operatorMock = mock(OperatorIfc.class);
        configuration.addInfixOperator("*", 1, true, operatorMock);
        Tokenizer tokenizer = new Tokenizer("1 * )", configuration);
        try {
            tokenizer.parse();
            Assert.fail("Exception should have been thrown");
        } catch (ParseException ex) {
            Assert.assertEquals("Unexpected token after infix operator", ex.getMessage());
        }
    }

    @Test
    public void implicitMultiplicationPossibleWithBraceCloseAndBraceOpenTest() throws ParseException {
        ExpressionConfiguration configuration = new ExpressionConfiguration();
        Tokenizer tokenizer = new Tokenizer(")(", configuration);
        List<Token> tokens = tokenizer.parse();
        Assert.assertEquals(3, tokens.size());
        Assert.assertEquals(BRACE_CLOSE, tokens.get(0).getType());
        Assert.assertEquals(INFIX_OPERATOR, tokens.get(1).getType());
        Assert.assertEquals(BRACE_OPEN, tokens.get(2).getType());
    }

}