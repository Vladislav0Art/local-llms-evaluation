package com.ezylang.evalex.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Generated[parseStringLiteral][ThrowParseException]{

@Mock
private ExpressionConfiguration configuration;

@Mock
private ParseException exception;

public Tokenizer tokenizer = new Tokenizer("expression", configuration);

@Test
public void [parseStringLiteral][ThrowParseException](){

assertThrows(ParseException .class, () ->tokenizer.

parseStringLiteral());
        }

        }