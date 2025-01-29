package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithDoctypeToken {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithDoctypeToken() {
        xmlTreeBuilder.insert(new TokenDoctype("<!DOCTYPE html><html></html>"));
        Document document = xmlTreeBuilder.parse("http://example.com/baseuri");
        assertEquals("<!DOCTYPE html><html></html>", document.body().text());
    }

}