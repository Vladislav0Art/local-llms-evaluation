package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestInsertToken_commentToken {

    @Test
    public void testInsertToken_commentToken() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root><child></child></root>"), null);
        Element element = document.getElementById("comment");
        assertEquals("http://example.com", element.getAttributes().getFirstValue());
    }

}