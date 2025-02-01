package org.jsoup.parser;

import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        Mockito.when(token.type).thenReturn(Token.TokenType.StartTag);
        assertTrue(xmlTreeBuilder.process(token));
    }

}