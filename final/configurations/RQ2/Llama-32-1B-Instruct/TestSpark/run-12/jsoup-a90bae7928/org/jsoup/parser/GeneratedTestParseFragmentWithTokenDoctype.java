package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseFragmentWithTokenDoctype {

    @Test
    public void testParseFragmentWithTokenDoctype() {
        String baseUri = "http://example.com";
        ParseSettings settings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(settings);
        Element element = xmlTreeBuilder.parseFragment(new Token("<root><child>text</child></root>", "", null), baseUri, null);
        Assert.assertEquals(" http://example.com/", element.toString());
    }

}