package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseWithReaderTest {

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        String baseUri = "dummyUri";
        Document document = xmlTreeBuilder.parse(reader, baseUri);
        assertNotNull(document);
        assertEquals("root", document.child(0).tagName());
    }

}