package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseReaderBaseUriTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Document document = xmlTreeBuilder.parse(new StringReader("<root>Test</root>"), "http://test.com");

        assertEquals("Test", document.text());
    }

}