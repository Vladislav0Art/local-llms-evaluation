package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithoutContext {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithoutContext() {
        Document document = xmlTreeBuilder.parse(new StringReader("<root></root>"));
        assertNotNull(document);
        assertEquals("root", document.body().text());
    }

}