package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseInputBaseUriTest {

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<html></html>", "http://example.com");
        assertNotNull(document);
    }

}