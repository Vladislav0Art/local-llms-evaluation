package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessUnexpectedTypeTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void processUnexpectedTypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token();

        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("Unexpected token type");
        xmlTreeBuilder.process(token);
    }

}