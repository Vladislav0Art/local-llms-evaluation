package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringBaseUriTest {

    @Test
    public void parseStringBaseUriTest() {
        Document parsedDocument = new XmlTreeBuilder().parse("<root></root>", "http://base.uri");
        assertNotNull(parsedDocument);
        assertEquals("http://base.uri", parsedDocument.baseUri());
    }

}