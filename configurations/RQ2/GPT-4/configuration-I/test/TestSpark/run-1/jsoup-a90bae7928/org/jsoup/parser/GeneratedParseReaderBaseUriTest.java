package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseReaderBaseUriTest {

    @Test
    public void parseReaderBaseUriTest() {
        Document parsedDocument = new XmlTreeBuilder().parse(new StringReader("<root></root>"), "http://base.uri");
        assertNotNull(parsedDocument);
        assertEquals("http://base.uri", parsedDocument.baseUri());
    }

}