package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithCharacterToken {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithCharacterToken() {
        Element element = new Element("div");
        element.text("Hello, World!");
        Document document = xmlTreeBuilder.parse(element, "http://example.com/baseuri");
        assertEquals("Hello, World!", document.body().text());
    }

}