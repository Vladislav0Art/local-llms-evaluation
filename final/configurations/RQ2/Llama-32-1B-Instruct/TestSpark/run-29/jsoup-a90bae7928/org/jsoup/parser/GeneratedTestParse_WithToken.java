package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithToken {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithToken() {
        Document document = xmlTreeBuilder.parse("http://example.com/baseuri");
        assertNotNull(document);
        assertTrue(document instanceof Document);
        Element element = (Element) document.body();
        assertTrue(element.text().contains("<!DOCTYPE html><html></html>"));
    }

}