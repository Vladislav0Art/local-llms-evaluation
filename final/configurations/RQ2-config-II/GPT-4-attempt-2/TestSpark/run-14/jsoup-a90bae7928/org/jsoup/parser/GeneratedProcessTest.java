package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessTest {

    @Test
    public void processTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token.StartTag();
        token.tagName("html");
        assertTrue(builder.process(token));
    }

}