package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() {
        String baseUri = "http://example.com";
        ParseSettings settings = new ParseSettings();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(settings);
        Document document = xmlTreeBuilder.parseFragment(" <root><child>text</child></root>", baseUri, null);
        Assert.assertEquals(" http://example.com/", document.toString());
    }

}