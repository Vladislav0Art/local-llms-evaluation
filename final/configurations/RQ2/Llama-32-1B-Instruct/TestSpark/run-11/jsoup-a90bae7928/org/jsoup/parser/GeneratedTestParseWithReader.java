package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestParseWithReader {

    @Test
    public void testParseWithReader() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String baseUri = "http://example.com";
        Document document = builder.parse(new StringReader("<root><child></child></root>"), baseUri);
        assertEquals("application/xml", document.getNamespace());
    }

}