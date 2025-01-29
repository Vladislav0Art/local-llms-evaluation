package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithContext {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithContext() {
        Element root = xmlTreeBuilder.newInstance();
        Document document = xmlTreeBuilder.parse(root, "http://example.com/baseuri");
        assertTrue(document instanceof Document);
    }

}