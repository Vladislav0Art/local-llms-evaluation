package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class GeneratedParseTest {

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<doc><element /></doc>";
        String baseUri = "http://example.com";

        Document document = xmlTreeBuilder.parse(input, baseUri);

        assertNotNull(document);
        assertEquals("doc", document.child(0).tagName());
    }

}