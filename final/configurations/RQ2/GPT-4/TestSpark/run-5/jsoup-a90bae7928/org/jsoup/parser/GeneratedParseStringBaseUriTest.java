package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseStringBaseUriTest {

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root>", "http://test/");
        assertNotNull(doc);
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.childNode(0).nodeName());
    }

}