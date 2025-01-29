package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInitialiseParse_withReader {

    @Test
    public void testInitialiseParse_withReader() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String baseUri = "http://example.com";
        Document document = builder.initialiseParse(new StringReader("<root><child></child></root>"), baseUri, null);
        assertEquals("application/xml", document.getNamespace());
    }

}