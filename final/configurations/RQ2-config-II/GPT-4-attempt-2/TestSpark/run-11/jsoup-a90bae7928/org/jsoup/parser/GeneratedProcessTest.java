package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        Token token = Mockito.mock(Token.class);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertTrue(builder.process(token));
    }

}