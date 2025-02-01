package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringBaseUriTest {

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Document document = xmlTreeBuilder.parse("<root>Test</root>", "http://test.com");

        assertEquals("Test", document.text());
    }

}