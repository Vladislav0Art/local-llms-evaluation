package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringTest {

    @Test
    public void parseStringTest() {
        Document doc = new XmlTreeBuilder().parse("<tag>content</tag>", "http://baseUri.com");
        assertNotNull(doc);
    }

}