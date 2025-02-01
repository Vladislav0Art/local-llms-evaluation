package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseStringBaseUriTest {

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<root></root>", "http://example.com");
        assertEquals("<root></root>", doc.toString());
    }

}